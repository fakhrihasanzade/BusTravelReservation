package com.BusTravel.BusTravelReservation.reservation.controller;

import com.BusTravel.BusTravelReservation.reservation.dto.response.ReservationResponse;
import com.BusTravel.BusTravelReservation.reservation.entity.Reservation;
import com.BusTravel.BusTravelReservation.reservation.service.ReservationAdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/reservations/")
@RequiredArgsConstructor
public class ReservationAdminController {

    private final ReservationAdminService service;

    @GetMapping()
    private List<Reservation> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    private Reservation getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("from_location/{fromLocation}")
    private List<ReservationResponse> getByFromLocation(@PathVariable String fromLocation) {
        return service.getByFromLocation(fromLocation);
    }

    @GetMapping("to_location/{toLocation}")
    private List<ReservationResponse> getByToLocation(@PathVariable String toLocation) {
        return service.getByToLocation(toLocation);
    }

    @GetMapping("reservation_date/{reservationDate}")
    private List<ReservationResponse> getByReservationDate(@PathVariable LocalDate reservationDate) {
        return service.getByReservationDate(reservationDate);
    }

    @GetMapping("ticket_date/{ticketDate}")
    private List<ReservationResponse> getByTickedDate(@PathVariable LocalDate ticketDate) {
        return service.getByTickedDate(ticketDate);
    }

}
