package com.BusTravel.BusTravelReservation.user.service;

import com.BusTravel.BusTravelReservation.user.dto.request.UserRequest;
import com.BusTravel.BusTravelReservation.user.dto.response.UserResponse;
import com.BusTravel.BusTravelReservation.user.entity.User;

import java.time.LocalDate;
import java.util.List;

public interface AdminUserService {

    List<User> getAll();

    List<UserResponse> getByFullName(String fullName);

    List<UserResponse> getByBirthDate(LocalDate birthDate);

    List<UserResponse> getByAge(int age);

    List<UserResponse> getByYear(int year);

    List<UserResponse> getByAddress(String address);

    User getById(Long id);

    void delete(Long id);

    void update(Long id, UserRequest user);

    void create(UserRequest user);

}
