package com.BusTravel.BusTravelReservation.ticket.mapper;

import com.BusTravel.BusTravelReservation.ticket.dto.request.TicketRequest;
import com.BusTravel.BusTravelReservation.ticket.dto.response.TicketResponse;
import com.BusTravel.BusTravelReservation.ticket.entity.Ticket;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-21T19:48:17+0400",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class TicketMapperImpl implements TicketMapper {

    @Override
    public TicketResponse toDto(Ticket ticket) {
        if ( ticket == null ) {
            return null;
        }

        TicketResponse.TicketResponseBuilder ticketResponse = TicketResponse.builder();

        ticketResponse.fromLocation( ticket.getFromLocation() );
        ticketResponse.toLocation( ticket.getToLocation() );
        ticketResponse.fkUserId( ticket.getFkUserId() );
        ticketResponse.price( ticket.getPrice() );
        ticketResponse.ticketDate( ticket.getTicketDate() );
        ticketResponse.seatNumber( ticket.getSeatNumber() );
        ticketResponse.fkReservationId( ticket.getFkReservationId() );

        return ticketResponse.build();
    }

    @Override
    public Ticket toEntity(TicketRequest ticketRequest) {
        if ( ticketRequest == null ) {
            return null;
        }

        Ticket.TicketBuilder ticket = Ticket.builder();

        ticket.fromLocation( ticketRequest.getFromLocation() );
        ticket.toLocation( ticketRequest.getToLocation() );
        ticket.fkUserId( ticketRequest.getFkUserId() );
        ticket.price( ticketRequest.getPrice() );
        ticket.ticketDate( ticketRequest.getTicketDate() );
        ticket.seatNumber( ticketRequest.getSeatNumber() );
        ticket.fkReservationId( ticketRequest.getFkReservationId() );

        return ticket.build();
    }

    @Override
    public void update(TicketRequest ticketRequest, Ticket ticket) {
        if ( ticketRequest == null ) {
            return;
        }

        ticket.setFromLocation( ticketRequest.getFromLocation() );
        ticket.setToLocation( ticketRequest.getToLocation() );
        ticket.setFkUserId( ticketRequest.getFkUserId() );
        ticket.setPrice( ticketRequest.getPrice() );
        ticket.setTicketDate( ticketRequest.getTicketDate() );
        ticket.setSeatNumber( ticketRequest.getSeatNumber() );
        ticket.setFkReservationId( ticketRequest.getFkReservationId() );
    }
}
