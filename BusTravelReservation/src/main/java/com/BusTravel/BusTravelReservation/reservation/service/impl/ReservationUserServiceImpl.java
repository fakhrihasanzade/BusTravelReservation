package com.BusTravel.BusTravelReservation.reservation.service.impl;

import com.BusTravel.BusTravelReservation.reservation.dto.request.ReservationRequest;
import com.BusTravel.BusTravelReservation.reservation.entity.Reservation;
import com.BusTravel.BusTravelReservation.reservation.mapper.ReservationMapper;
import com.BusTravel.BusTravelReservation.reservation.repository.ReservationRepository;
import com.BusTravel.BusTravelReservation.reservation.service.ReservationUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationUserServiceImpl implements ReservationUserService {

    private final ReservationMapper mapper;

    private final ReservationRepository repository;

    @Override
    public Reservation create(ReservationRequest reservation) {
        Reservation reservations = mapper.toEntity(reservation);
        return repository.save(reservations);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }

    @Override
    public void update(Long id, ReservationRequest request) {
        Reservation reservations = repository.findById(id).orElseThrow();
        mapper.update(request, reservations);
        repository.save(reservations);
    }
}
