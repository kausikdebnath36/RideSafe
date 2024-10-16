package com.debnath.RideSafe.Dto;

import com.debnath.RideSafe.Enum.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    private Long userId;

    private String name;

    private Long mobileNumber;

    private String emailId;

    private Role role;



    private String imagePath;


    public UserDto(Long userId, String name, Long mobileNumber, String emailId, Role role, String imagePath) {
        this.userId = userId;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.role = role;
        this.imagePath = imagePath;
    }
}
