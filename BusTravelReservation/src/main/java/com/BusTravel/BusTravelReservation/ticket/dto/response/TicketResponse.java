package com.BusTravel.BusTravelReservation.ticket.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class TicketResponse {

    Integer number;

    String fromLocation;

    String toLocation;

    String fkUserId;

    Double price;

    LocalDate ticketDate;

    Integer seatNumber;

    String fkReservationId;
}
