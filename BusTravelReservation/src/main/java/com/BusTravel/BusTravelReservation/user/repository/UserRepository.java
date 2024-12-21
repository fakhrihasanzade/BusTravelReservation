package com.BusTravel.BusTravelReservation.user.repository;

import com.BusTravel.BusTravelReservation.user.dto.response.UserResponse;
import com.BusTravel.BusTravelReservation.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE LOWER (u.fullName) "
            + "LIKE LOWER (CONCAT('%',:fullName,'%'))")
    List<User> findByFullName(@Param("fullName") String fullName);

    @Query("SELECT u FROM User u WHERE LOWER(u.address)"
            + "LIKE LOWER(CONCAT('%',:address,'%'))")
    List<User> findByAddress(@Param("address") String address);

    @Query("SELECT u FROM User u WHERE u.birthDate =:birthDate")
    List<UserResponse> findByBirthDate(@Param("birthDate") LocalDate birthDate);

    @Query("SELECT u FROM User u WHERE YEAR(CURRENT_DATE)-YEAR(u.birthDate)=:age")
    List<User> findByAge(@Param("age") int age);


    @Query("SELECT u FROM User u WHERE EXTRACT (YEAR FROM u.birthDate )= :year")
    List<User> finByYear(@Param("year") int year);

}
