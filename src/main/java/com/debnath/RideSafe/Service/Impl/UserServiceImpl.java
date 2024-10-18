package com.debnath.RideSafe.Service.Impl;

import com.debnath.RideSafe.Dto.UserRegistrationRequest;
import com.debnath.RideSafe.Entity.User;
import com.debnath.RideSafe.Enum.Role;
import com.debnath.RideSafe.Repository.UserRepository;
import com.debnath.RideSafe.Service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserRepository userRepository;


    // Register a new user (Driver or Rider)
    public void registerUser(UserRegistrationRequest request) throws Exception {
        // Check if the phone is already in use
        if (userRepository.findByMobileNumber(request.getMobileNumber()).isPresent()) {
            throw new Exception("Mobile No already in use");
        }

        // Create a new user entity
        User user = new User();
        user.setName(request.getName());
        user.setEmailId(request.getEmail());
        user.setRole(Role.RIDER);


        // Save the user to the database
        userRepository.save(user);
    }


}