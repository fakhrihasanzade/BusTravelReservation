package com.BusTravel.BusTravelReservation.user.mapper;

import com.BusTravel.BusTravelReservation.user.dto.request.UserRequest;
import com.BusTravel.BusTravelReservation.user.dto.response.UserResponse;
import com.BusTravel.BusTravelReservation.user.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-21T19:48:17+0400",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponse toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse.UserResponseBuilder userResponse = UserResponse.builder();

        userResponse.fullName( user.getFullName() );
        userResponse.phoneNumber( user.getPhoneNumber() );
        userResponse.address( user.getAddress() );
        userResponse.email( user.getEmail() );
        userResponse.isActive( user.getIsActive() );
        userResponse.birthDate( user.getBirthDate() );
        userResponse.role( user.getRole() );

        return userResponse.build();
    }

    @Override
    public User toEntity(UserRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.fullName( userRequest.getFullName() );
        user.password( userRequest.getPassword() );
        user.phoneNumber( userRequest.getPhoneNumber() );
        user.isActive( userRequest.getIsActive() );
        user.address( userRequest.getAddress() );
        user.email( userRequest.getEmail() );
        user.birthDate( userRequest.getBirthDate() );
        user.role( userRequest.getRole() );

        return user.build();
    }

    @Override
    public void updateFromDto(UserRequest userRequest, User userUpdate) {
        if ( userRequest == null ) {
            return;
        }

        userUpdate.setFullName( userRequest.getFullName() );
        userUpdate.setPassword( userRequest.getPassword() );
        userUpdate.setPhoneNumber( userRequest.getPhoneNumber() );
        userUpdate.setIsActive( userRequest.getIsActive() );
        userUpdate.setAddress( userRequest.getAddress() );
        userUpdate.setEmail( userRequest.getEmail() );
        userUpdate.setBirthDate( userRequest.getBirthDate() );
        userUpdate.setRole( userRequest.getRole() );
    }
}
