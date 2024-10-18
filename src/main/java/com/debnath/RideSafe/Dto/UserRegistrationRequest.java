package com.debnath.RideSafe.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationRequest {
    private String name;
    private String mobileNumber;
    private String email;
}
