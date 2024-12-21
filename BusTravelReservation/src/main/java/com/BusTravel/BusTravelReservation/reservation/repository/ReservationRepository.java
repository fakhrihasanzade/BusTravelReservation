package com.BusTravel.BusTravelReservation.reservation.repository;

import com.BusTravel.BusTravelReservation.reservation.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {

    @Query("SELECT r FROM Reservation r WHERE LOWER (r.fromLocation)"
            +"LIKE LOWER(CONCAT('%',:fromLocation,'%'))")
    List<Reservation> findByFromLocation(@Param("fromLocation") String fromLocation);

    @Query("SELECT r FROM Reservation r WHERE LOWER(r.toLocation)"
            +"LIKE LOWER(CONCAT('%',:toLocation,'%'))")
    List<Reservation> findByToLocation(@Param("toLocation") String toLocation);

    List<Reservation> findByReservationDate(LocalDate reservationDate);

    List<Reservation> findByTickedDate(LocalDate ticketDate);

}
