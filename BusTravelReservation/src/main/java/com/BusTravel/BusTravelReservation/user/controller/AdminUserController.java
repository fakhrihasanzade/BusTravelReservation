package com.BusTravel.BusTravelReservation.user.controller;

import com.BusTravel.BusTravelReservation.user.dto.request.UserRequest;
import com.BusTravel.BusTravelReservation.user.dto.response.UserResponse;
import com.BusTravel.BusTravelReservation.user.entity.User;
import com.BusTravel.BusTravelReservation.user.service.AdminUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/admin/user/")
@RequiredArgsConstructor
public class AdminUserController {
    private final AdminUserService service;

    @GetMapping()
    private List<User> getAll(){
        return service.getAll();
    }

    @GetMapping("full_name/{full-name}")
    private List<UserResponse> getByFullName(@PathVariable("full-name") String fullName){
        return service.getByFullName(fullName);
    }

    @GetMapping("birthdate/{birth-date}")
    private List<UserResponse> getByBirthDate(
            @PathVariable("birth-date") LocalDate birthDate){
        return service.getByBirthDate(birthDate);
    }


    @GetMapping("age/{age}")
    private List<UserResponse> getByAge(@PathVariable int age){
        return service.getByAge(age);
    }

    @GetMapping("year/{year}")
    private List<UserResponse> getByYear(@PathVariable int year){
        return service.getByYear(year);
    }

    @GetMapping("address/{address}")
    private List<UserResponse> getByAddress(@PathVariable String address){
        return service.getByAddress(address);
    }

    @GetMapping("{id}")
    private User getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("{id}")
    private void delete(@PathVariable Long id){
        service.delete(id);
    }

    @PutMapping("{id}")
    private void update(@PathVariable Long id,@RequestBody UserRequest user){
        service.update(id, user);
    }

    @PostMapping()
    void create(@RequestBody UserRequest user){
        service.create(user);
    }
}
