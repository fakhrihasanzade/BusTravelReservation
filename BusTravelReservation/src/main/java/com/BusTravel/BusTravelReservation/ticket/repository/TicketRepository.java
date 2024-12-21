package com.BusTravel.BusTravelReservation.ticket.repository;

import com.BusTravel.BusTravelReservation.ticket.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    @Query("SELECT t FROM Ticket t WHERE t.fkUserId=:userId")
    List<Ticket> findTicketByUserId(@Param("userId") String userId);

    @Query("SELECT t FROM  Ticket t WHERE t.fromLocation=:fromLocation")
    List<Ticket> findTicketByFromLocation(@Param("fromLocation") String fromLocation);

    @Query("SELECT t FROM  Ticket t WHERE t.toLocation=:toLocation")
    List<Ticket> findTicketByToLocation(@Param("toLocation") String toLocation);

    @Query("SELECT t FROM Ticket t WHERE t.ticketDate=:ticketDate")
    List<Ticket> findTicketByTicketDate(@Param("ticketDate") LocalDate ticketDate);

    @Query("DELETE FROM Ticket t WHERE t.id=:id AND t.ticketDate-:date<2")
    void deleteTicketByIdAndDate(@Param("id") Long id, @Param("date") LocalDate date);

}
