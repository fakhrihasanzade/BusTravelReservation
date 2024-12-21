package com.BusTravel.BusTravelReservation.ticket.controller;


import com.BusTravel.BusTravelReservation.ticket.dto.request.TicketRequest;
import com.BusTravel.BusTravelReservation.ticket.dto.response.TicketResponse;
import com.BusTravel.BusTravelReservation.ticket.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ticket/user")
public class TicketController {

    private final TicketService service;

    @GetMapping("/{user-id}")
    public List<TicketResponse> getUserTicketByUserId(@PathVariable("user-id") String userId){
        return service.getUserTicketByUserId(userId);
    }

    @PostMapping()
    public void createTicket(@RequestBody TicketRequest dto){
        service.createTicket(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteTicketById(@PathVariable Long id){
        service.deleteTicketById(id);
    }

}
