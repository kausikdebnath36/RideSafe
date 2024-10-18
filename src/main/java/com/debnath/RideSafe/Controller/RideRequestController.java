package com.debnath.RideSafe.Controller;

import com.debnath.RideSafe.Entity.RideRequest;
import com.debnath.RideSafe.Entity.User;
import com.debnath.RideSafe.Enum.PaymentMethod;
import com.debnath.RideSafe.Enum.RideStatus;
import com.debnath.RideSafe.Repository.RideRequestRepository;
import com.debnath.RideSafe.Repository.UserRepository;
import com.debnath.RideSafe.Service.Impl.RideRequestServiceImpl;
import com.debnath.RideSafe.Service.RideRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/rides")
public class RideRequestController {

   private String status=null;

    private RideRequestService rideRequestService;

    @Autowired
    public RideRequestController(RideRequestService rideRequestService) {
        this.rideRequestService = rideRequestService;
    }

    // Rider requesting a ride
    @PostMapping("/request")
    public RideRequest requestRide(@RequestParam Long riderId, @RequestParam String pickupLocation, @RequestParam String dropoffLocation, @RequestParam int offeredPrice) {
        RideRequest newRequest= rideRequestService.createRideRequest(riderId,pickupLocation,dropoffLocation,offeredPrice);
                return newRequest;
    }

    // Driver accepting a ride
    @PostMapping("/accept")
    public RideRequest acceptRide(@RequestParam Long driverId, @RequestParam Long reqId) {

        return rideRequestService.acceptRideRequest(driverId,reqId);
    }

    //Driver offering a different price
    @PostMapping("/bargain")
    @Async
    public RideRequest bargain(@RequestParam Long driverId, @RequestParam Long reqId,@RequestParam int driverOfferedPrice) {
        return rideRequestService.bargainRideRequest(driverId,reqId,driverOfferedPrice);

    }

    @PostMapping("/acceptreq")
    private void acceptRidebargain() {
        status="ACCEPTED";
    }


    // View all pending ride requests
    @GetMapping("/pending")
    public List<RideRequest> getPendingRides() {

        return rideRequestService.getPendingRequest();
    }




}