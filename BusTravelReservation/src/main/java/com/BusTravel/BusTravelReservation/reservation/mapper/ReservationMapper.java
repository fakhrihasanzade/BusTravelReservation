package com.BusTravel.BusTravelReservation.reservation.mapper;

import com.BusTravel.BusTravelReservation.reservation.dto.request.ReservationRequest;
import com.BusTravel.BusTravelReservation.reservation.dto.response.ReservationResponse;
import com.BusTravel.BusTravelReservation.reservation.entity.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "Spring")
public interface ReservationMapper {

    ReservationResponse toDto(Reservation reservation);

    Reservation toEntity(ReservationRequest request);

    void update(ReservationRequest request, @MappingTarget Reservation reservation);

}
