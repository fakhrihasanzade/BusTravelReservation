package com.BusTravel.BusTravelReservation.ticket.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class TicketRequest {

    String fromLocation;

    String toLocation;

    String fkUserId;

    Double price;

    LocalDate ticketDate;

    Integer seatNumber;

    String fkReservationId;
}
