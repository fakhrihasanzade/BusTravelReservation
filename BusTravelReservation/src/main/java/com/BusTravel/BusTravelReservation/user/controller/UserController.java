package com.BusTravel.BusTravelReservation.user.controller;

import com.BusTravel.BusTravelReservation.user.dto.request.UserRequest;
import com.BusTravel.BusTravelReservation.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users/")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @DeleteMapping("{id}")
    private void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("{id}")
    private void update(@PathVariable Long id, @RequestBody UserRequest user) {
        service.update(id, user);
    }

    @PostMapping()
    private void create(@RequestBody UserRequest user) {
        service.create(user);
    }

}
