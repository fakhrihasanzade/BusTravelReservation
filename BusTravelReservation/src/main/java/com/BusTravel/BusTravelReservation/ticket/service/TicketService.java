package com.BusTravel.BusTravelReservation.ticket.service;

import com.BusTravel.BusTravelReservation.ticket.dto.request.TicketRequest;
import com.BusTravel.BusTravelReservation.ticket.dto.response.TicketResponse;

import java.time.LocalDate;
import java.util.List;

public interface TicketService {

    List<TicketResponse> getUserTicketByUserId(String userId);

    List<TicketResponse> getAll();

    List<TicketResponse> getByFromLocation(String fromLocation);

    List<TicketResponse> getByToLocation(String toLocation);

    List<TicketResponse> getByTicketDate(LocalDate ticketDate);

    void createTicket(TicketRequest dto);

    void deleteTicketById(Long id);
}
