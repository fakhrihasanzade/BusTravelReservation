package com.BusTravel.BusTravelReservation.user.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "full_name", nullable = false)
    String fullName;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "phone_number", nullable = false)
    String phoneNumber;

    @Column(name = "is_active", nullable = false)
    Boolean isActive;

    @Column(name = "address", nullable = false)
    String address;

    @Column(name = "email", nullable = false)
    String email;

    @Column(name = "birthdate", nullable = false)
    LocalDate birthDate;

    @Column(name = "role", nullable = false)
    String role;

}