package com.BusTravel.BusTravelReservation.user.service.impl;

import com.BusTravel.BusTravelReservation.user.dto.request.UserRequest;
import com.BusTravel.BusTravelReservation.user.dto.response.UserResponse;
import com.BusTravel.BusTravelReservation.user.entity.User;
import com.BusTravel.BusTravelReservation.user.mapper.UserMapper;
import com.BusTravel.BusTravelReservation.user.repository.UserRepository;
import com.BusTravel.BusTravelReservation.user.service.AdminUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminUserServiceImpl implements AdminUserService {

    private final UserRepository repository;

    private final UserMapper mapper;

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public List<UserResponse> getByFullName(String fullName) {
        List<User> users = repository.findByFullName(fullName);
        return users.stream().map(mapper::toDto).toList();
    }

    @Override
    public List<UserResponse> getByBirthDate(LocalDate birthDate) {
        return repository.findByBirthDate(birthDate);
    }

    @Override
    public List<UserResponse> getByAge(int age) {
        List<User> users = repository.findByAge(age);
        return users.stream()
                .map(mapper::toDto).toList();
    }

    @Override
    public List<UserResponse> getByYear(int year) {
        List<User> users = repository.finByYear(year);
        return users.stream().map(mapper::toDto).toList();
    }

    @Override
    public List<UserResponse> getByAddress(String address) {
        List<User> users = repository.findByAddress(address);
        return users.stream().map(mapper::toDto).toList();
    }

    @Override
    public User getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }

    @Override
    public void update(Long id, UserRequest user) {
        User users = repository.findById(id).orElseThrow();
        mapper.updateFromDto(user, users);
        repository.save(users);
    }

    @Override
    public void create(UserRequest user) {
        User users = mapper.toEntity(user);
        repository.save(users);

    }
}