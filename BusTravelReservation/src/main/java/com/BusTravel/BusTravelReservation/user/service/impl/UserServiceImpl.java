package com.BusTravel.BusTravelReservation.user.service.impl;

import com.BusTravel.BusTravelReservation.user.dto.request.UserRequest;
import com.BusTravel.BusTravelReservation.user.dto.response.UserResponse;
import com.BusTravel.BusTravelReservation.user.entity.User;
import com.BusTravel.BusTravelReservation.user.mapper.UserMapper;
import com.BusTravel.BusTravelReservation.user.repository.UserRepository;
import com.BusTravel.BusTravelReservation.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final UserMapper mapper;

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

    @Override
    public UserResponse getById(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow());
    }
}