package com.BusTravel.BusTravelReservation.reservation.service.impl;

import com.BusTravel.BusTravelReservation.reservation.dto.response.ReservationResponse;
import com.BusTravel.BusTravelReservation.reservation.entity.Reservation;
import com.BusTravel.BusTravelReservation.reservation.mapper.ReservationMapper;
import com.BusTravel.BusTravelReservation.reservation.repository.ReservationRepository;
import com.BusTravel.BusTravelReservation.reservation.service.ReservationAdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationAdminServiceImpl implements ReservationAdminService {
    private final ReservationRepository repository;
    private final ReservationMapper mapper;

    @Override
    public List<Reservation> getAll() {
        return repository.findAll();
    }

    @Override
    public Reservation getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<ReservationResponse> getByFromLocation(String fromLocation) {
        List<Reservation> reservations = repository.findByFromLocation(fromLocation);
        return reservations.stream().map(mapper::toDto).toList();
    }

    @Override
    public List<ReservationResponse> getByToLocation(String toLocation) {
     List<Reservation> reservations = repository.findByToLocation(toLocation);
        return reservations.stream().map(mapper::toDto).toList();
    }

    @Override
    public List<ReservationResponse> getByReservationDate(LocalDate reservationDate) {
        List<Reservation> reservations = repository.findByReservationDate(reservationDate);
        return reservations.stream().map(mapper::toDto).toList();
    }

    @Override
    public List<ReservationResponse> getByTickedDate(LocalDate ticketDate) {
        List<Reservation> reservations = repository.findByTickedDate(ticketDate);
        return reservations.stream().map(mapper::toDto).toList();
    }
}
