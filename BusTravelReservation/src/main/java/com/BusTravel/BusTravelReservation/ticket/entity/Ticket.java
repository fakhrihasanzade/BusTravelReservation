package com.BusTravel.BusTravelReservation.ticket.entity;

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
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "number", nullable = false)
    Integer ticketNumber;

    @Column(name = "from_location", nullable = false)
    String fromLocation;

    @Column(name = "to_location", nullable = false)
    String toLocation;

    @Column(name = "user_id", nullable = false)
    String fkUserId;

    @Column(name = "price", nullable = false)
    Double price;

    @Column(name = "date", nullable = false)
    LocalDate ticketDate;

    @Column(name = "seat_number", nullable = false)
    Integer seatNumber;

    @Column(name = "reservation_id", nullable = false)
    String fkReservationId;
}
