package com.BusTravel.BusTravelReservation.reservation.service;

import com.BusTravel.BusTravelReservation.reservation.dto.request.ReservationRequest;
import com.BusTravel.BusTravelReservation.reservation.entity.Reservation;

public interface ReservationUserService {

    Reservation create(ReservationRequest reservation);

    void delete(Long id);

    void update(Long id,ReservationRequest request);

}
