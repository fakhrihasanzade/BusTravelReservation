package com.BusTravel.BusTravelReservation.reservation.mapper;

import com.BusTravel.BusTravelReservation.reservation.dto.request.ReservationRequest;
import com.BusTravel.BusTravelReservation.reservation.dto.response.ReservationResponse;
import com.BusTravel.BusTravelReservation.reservation.entity.Reservation;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-21T19:48:17+0400",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public ReservationResponse toDto(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationResponse.ReservationResponseBuilder reservationResponse = ReservationResponse.builder();

        reservationResponse.fromLocation( reservation.getFromLocation() );
        reservationResponse.toLocation( reservation.getToLocation() );
        reservationResponse.price( reservation.getPrice() );
        reservationResponse.seatNumber( reservation.getSeatNumber() );
        reservationResponse.fkUserId( reservation.getFkUserId() );
        reservationResponse.reservationDate( reservation.getReservationDate() );
        reservationResponse.status( reservation.getStatus() );

        return reservationResponse.build();
    }

    @Override
    public Reservation toEntity(ReservationRequest request) {
        if ( request == null ) {
            return null;
        }

        Reservation.ReservationBuilder reservation = Reservation.builder();

        reservation.fromLocation( request.getFromLocation() );
        reservation.toLocation( request.getToLocation() );
        reservation.price( request.getPrice() );
        reservation.seatNumber( request.getSeatNumber() );
        reservation.fkUserId( request.getFkUserId() );
        reservation.reservationDate( request.getReservationDate() );
        reservation.tickedDate( request.getTickedDate() );
        reservation.status( request.getStatus() );

        return reservation.build();
    }

    @Override
    public void update(ReservationRequest request, Reservation reservation) {
        if ( request == null ) {
            return;
        }

        reservation.setFromLocation( request.getFromLocation() );
        reservation.setToLocation( request.getToLocation() );
        reservation.setPrice( request.getPrice() );
        reservation.setSeatNumber( request.getSeatNumber() );
        reservation.setFkUserId( request.getFkUserId() );
        reservation.setReservationDate( request.getReservationDate() );
        reservation.setTickedDate( request.getTickedDate() );
        reservation.setStatus( request.getStatus() );
    }
}
