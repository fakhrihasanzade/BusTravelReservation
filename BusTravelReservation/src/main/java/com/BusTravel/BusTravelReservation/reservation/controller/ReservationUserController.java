package com.BusTravel.BusTravelReservation.reservation.controller;

import com.BusTravel.BusTravelReservation.reservation.dto.request.ReservationRequest;
import com.BusTravel.BusTravelReservation.reservation.entity.Reservation;
import com.BusTravel.BusTravelReservation.reservation.service.ReservationUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservations/")
@RequiredArgsConstructor
public class ReservationUserController {

    private final ReservationUserService service;

    @PostMapping()
    private Reservation create(@RequestBody ReservationRequest reservation) {
        return service.create(reservation);
    }

    @DeleteMapping("{id}")
    private void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("{id}")
    private void update(@PathVariable Long id, @RequestBody ReservationRequest request) {
        service.update(id, request);
    }
}
