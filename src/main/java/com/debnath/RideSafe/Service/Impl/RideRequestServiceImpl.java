package com.debnath.RideSafe.Service.Impl;

import com.debnath.RideSafe.Entity.RideRequest;
import com.debnath.RideSafe.Entity.User;
import com.debnath.RideSafe.Enum.PaymentMethod;
import com.debnath.RideSafe.Enum.RideStatus;
import com.debnath.RideSafe.Repository.RideRequestRepository;
import com.debnath.RideSafe.Repository.UserRepository;
import com.debnath.RideSafe.Service.RideRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RideRequestServiceImpl implements RideRequestService {

    private final RideRequestRepository rideRequestRepository;
    private final UserRepository userRepository;

    @Autowired
    public RideRequestServiceImpl(RideRequestRepository rideRequestRepository, UserRepository userRepository) {
        this.rideRequestRepository = rideRequestRepository;
        this.userRepository = userRepository;
    }


    @Override
    public RideRequest createRideRequest(Long riderId,String pickupLocation, String dropoffLocation,int offeredPrice) {
        User rider = userRepository.findById(riderId).orElseThrow();
        RideRequest rideRequest = new RideRequest(null, pickupLocation, dropoffLocation, RideStatus.REQUESTED, null, rider, offeredPrice, null, LocalDateTime.now(), PaymentMethod.CASH);
        return rideRequestRepository.save(rideRequest);
    }

    @Override
    public RideRequest acceptRideRequest(Long driverId, Long rideId) {
        User driver = userRepository.findById(driverId).orElseThrow();
        RideRequest ride = rideRequestRepository.findById(rideId).orElseThrow();

            ride.setDriver(driver);
            ride.setAcceptedPrice(ride.getOfferedPrice());
            ride.setStatus(RideStatus.ACCEPTED);


        return rideRequestRepository.save(ride);
    }

//    @Override
//    public RideRequest  acceptBargain(Long driverId, Long rideId, String status) {
//
//
//        User driver = userRepository.findById(driverId).orElseThrow();
//        RideRequest ride = rideRequestRepository.findById(rideId).orElseThrow();
//        if(status.equals("ACCEPTED"))
//        {
//            ride.setStatus(RideStatus.ACCEPTED);
//        }
//        else {
//            ride.setDriver(null);
//            ride.setAcceptedPrice(null);
//            ride.setStatus(RideStatus.REQUESTED);
//        }
//        return rideRequestRepository.save(ride);
//    }

    @Override
    public RideRequest bargainRideRequest(Long driverId, Long rideId,int driverOfferedPrice) {
        User driver = userRepository.findById(driverId).orElseThrow();
        RideRequest ride = rideRequestRepository.findById(rideId).orElseThrow();
//       if(status.equals("ACCEPTED")){
           ride.setDriver(driver);
           ride.setAcceptedPrice(driverOfferedPrice);
           ride.setStatus(RideStatus.ACCEPTED);
//       }

        return rideRequestRepository.save(ride);
    }



    @Override
    public List<RideRequest> getPendingRequest() {
        return rideRequestRepository.findByStatus(RideStatus.REQUESTED);
    }
}
