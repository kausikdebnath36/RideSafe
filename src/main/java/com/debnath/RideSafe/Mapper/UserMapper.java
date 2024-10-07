package com.debnath.RideSafe.Mapper;

import com.debnath.RideSafe.Dto.UserDto;
import com.debnath.RideSafe.Entity.User;

public class UserMapper {

    public static User mapToUser(UserDto userDto){
        User user= new User(userDto.getUserId(),
                userDto.getName(),
                userDto.getMobileNumber(),
                userDto.getEmailId(),
                userDto.getRole(),
                userDto.getRiderId(),
                userDto.getImagePath());

        return user;
    }

    public static UserDto mapToUserDto(User user){
        UserDto userDto= new UserDto(user.getUserId(),
                user.getName(),
                user.getMobileNumber(),
                user.getEmailId(),
                user.getRole(),
                user.getRiderId(),
                user.getImagePath());

        return userDto;
    }
}
