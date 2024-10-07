package com.debnath.RideSafe.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    private Long userId;

    private String name;

    private Long mobileNumber;

    private String emailId;

    private String role;

    private Long riderId;

    private String imagePath;


    public UserDto(Long userId, String name, Long mobileNumber, String emailId, String role, Long riderId, String imagePath) {
        this.userId = userId;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.role = role;
        this.riderId = riderId;
        this.imagePath = imagePath;
    }
}
