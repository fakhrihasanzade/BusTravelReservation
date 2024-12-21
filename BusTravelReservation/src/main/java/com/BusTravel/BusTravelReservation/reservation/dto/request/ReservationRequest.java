package com.BusTravel.BusTravelReservation.reservation.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ReservationRequest {

    String fromLocation;

    String toLocation;

    Double price;

    Integer seatNumber;

    String fkUserId;

    LocalDate reservationDate;

    LocalDate TickedDate;

    String status;

}
