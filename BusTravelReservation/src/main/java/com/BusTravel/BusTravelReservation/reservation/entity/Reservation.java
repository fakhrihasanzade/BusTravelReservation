package com.BusTravel.BusTravelReservation.reservation.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "from_location", nullable = false)
    String fromLocation;

    @Column(name = "to_location", nullable = false)
    String toLocation;

    @Column(name = "price", nullable = false)
    Double price;

    @Column(name = "seat_number", nullable = false)
    Integer seatNumber;

    @Column(name = "user_id", nullable = false)
    String fkUserId;

    @Column(name = "reservation_date", nullable = false)
    LocalDate reservationDate;

    @Column(name = "ticked_date", nullable = false)
    LocalDate tickedDate;

    @Column(name = "status", nullable = false)
    String status;

}
