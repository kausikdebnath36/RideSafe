package com.debnath.RideSafe.Service;

import com.debnath.RideSafe.Entity.RideRequest;

import java.util.List;

public interface RideRequestService {

    RideRequest createRideRequest(Long riderId,String pickupLocation, String dropoffLocation,int offeredPrice);


    RideRequest acceptRideRequest(Long driverId, Long rideId);

    RideRequest bargainRideRequest(Long driverId, Long rideId,int driverOfferedPrice);

    List<RideRequest> getPendingRequest();



}
