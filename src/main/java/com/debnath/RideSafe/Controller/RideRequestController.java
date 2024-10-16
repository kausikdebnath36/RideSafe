package com.debnath.RideSafe.Controller;

import com.debnath.RideSafe.Entity.RideRequest;
import com.debnath.RideSafe.Entity.User;
import com.debnath.RideSafe.Enum.PaymentMethod;
import com.debnath.RideSafe.Enum.RideStatus;
import com.debnath.RideSafe.Repository.RideRequestRepository;
import com.debnath.RideSafe.Repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/rides")
public class RideRequestController {

    private final RideRequestRepository rideRequestRepository;
    private final UserRepository userRepository;

    public RideRequestController(RideRequestRepository rideRequestRepository, UserRepository userRepository) {
        this.rideRequestRepository = rideRequestRepository;
        this.userRepository = userRepository;
    }

    // Rider requesting a ride
    @PostMapping("/request")
    public RideRequest requestRide(@RequestParam Long riderId, @RequestParam String pickupLocation, @RequestParam String dropoffLocation, @RequestParam int offeredPrice) {
        User rider = userRepository.findById(riderId).orElseThrow();
        RideRequest rideRequest = new RideRequest(null, pickupLocation, dropoffLocation,RideStatus.REQUESTED, null, rider,offeredPrice,null, LocalDateTime.now(), PaymentMethod.CASH);
        return rideRequestRepository.save(rideRequest);
    }

    // Driver accepting a ride
    @PostMapping("/accept")
    public RideRequest acceptRide(@RequestParam Long driverId, @RequestParam Long rideId) {
        User driver = userRepository.findById(driverId).orElseThrow();
        RideRequest ride = rideRequestRepository.findById(rideId).orElseThrow();
        ride.setRider(driver);
        ride.setStatus(RideStatus.ACCEPTED);
        return rideRequestRepository.save(ride);
    }

    // View all pending ride requests
    @GetMapping("/pending")
    public List<RideRequest> getPendingRides() {
        return rideRequestRepository.findByStatus(RideStatus.REQUESTED);
    }
}

