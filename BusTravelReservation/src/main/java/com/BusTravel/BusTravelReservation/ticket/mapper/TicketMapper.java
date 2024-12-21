package com.BusTravel.BusTravelReservation.ticket.mapper;

import com.BusTravel.BusTravelReservation.ticket.dto.request.TicketRequest;
import com.BusTravel.BusTravelReservation.ticket.dto.response.TicketResponse;
import com.BusTravel.BusTravelReservation.ticket.entity.Ticket;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "Spring")
public interface TicketMapper {

    TicketResponse toDto(Ticket ticket);

    Ticket toEntity(TicketRequest ticketRequest);

    void update(TicketRequest ticketRequest, @MappingTarget Ticket ticket);

}
