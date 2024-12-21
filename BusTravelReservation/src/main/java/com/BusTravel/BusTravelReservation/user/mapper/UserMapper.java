package com.BusTravel.BusTravelReservation.user.mapper;

import com.BusTravel.BusTravelReservation.user.dto.request.UserRequest;
import com.BusTravel.BusTravelReservation.user.dto.response.UserResponse;
import com.BusTravel.BusTravelReservation.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "Spring")
public interface UserMapper {

    UserResponse toDto(User user);

    User toEntity(UserRequest userRequest);

    void updateFromDto(UserRequest userRequest, @MappingTarget User userUpdate);
}
