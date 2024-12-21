package com.BusTravel.BusTravelReservation.ticket.controller;

import com.BusTravel.BusTravelReservation.ticket.dto.response.TicketResponse;
import com.BusTravel.BusTravelReservation.ticket.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/ticket/admin/")
@RequiredArgsConstructor
public class AdminTicketController {

    private final TicketService service;

    @GetMapping()
    public List<TicketResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("{from-location}")
    public List<TicketResponse> getByFromLocation(
            @PathVariable("from-location") String fromLocation) {
        return service.getByFromLocation(fromLocation);
    }

    @GetMapping("{to-location}")
    public List<TicketResponse> getByToLocation(
            @PathVariable("to-location") String toLocation) {
        return service.getByToLocation(toLocation);
    }

    @GetMapping("{ticket-date}")
    public List<TicketResponse> getByTicketDate(@PathVariable("ticket-date") LocalDate ticketDate) {
        return service.getByTicketDate(ticketDate);
    }
}
