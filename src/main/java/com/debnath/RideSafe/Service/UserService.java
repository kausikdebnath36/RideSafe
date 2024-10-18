package com.debnath.RideSafe.Service;

import com.debnath.RideSafe.Dto.UserRegistrationRequest;

public interface UserService {
    public void registerUser(UserRegistrationRequest request) throws Exception;
}
