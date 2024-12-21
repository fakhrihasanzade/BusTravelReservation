package com.BusTravel.BusTravelReservation.reservation.service;

import com.BusTravel.BusTravelReservation.reservation.dto.response.ReservationResponse;
import com.BusTravel.BusTravelReservation.reservation.entity.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationAdminService {

    List<Reservation> getAll();

    Reservation getById(Long id);

    List<ReservationResponse> getByFromLocation(String fromLocation);

    List<ReservationResponse> getByToLocation(String toLocation);

    List<ReservationResponse> getByReservationDate(LocalDate reservationDate);

    List<ReservationResponse> getByTickedDate(LocalDate ticketDate);

}
