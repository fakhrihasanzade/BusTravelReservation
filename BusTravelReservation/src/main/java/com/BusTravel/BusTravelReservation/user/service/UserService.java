package com.BusTravel.BusTravelReservation.user.service;

import com.BusTravel.BusTravelReservation.user.dto.request.UserRequest;
import com.BusTravel.BusTravelReservation.user.dto.response.UserResponse;

public interface UserService {

    UserResponse getById(Long id);

    void delete(Long id);

    void update(Long id, UserRequest user);

    void create(UserRequest user);

}
