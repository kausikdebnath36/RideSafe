package com.debnath.RideSafe.Mapper;

import com.debnath.RideSafe.Dto.RideRequestDto;
import com.debnath.RideSafe.Entity.RideRequest;

public class RideRequestMapper {

    public static RideRequest mapToRide(RideRequestDto rideRequestDto){

        RideRequest rideRequest= new RideRequest(rideRequestDto.getId(),
                rideRequestDto.getPickUpLocation(),
                rideRequestDto.getDropLocation(),
                rideRequestDto.getStatus(),
                rideRequestDto.getDriverId(),
                rideRequestDto.getRiderId(),
                rideRequestDto.getOfferedPrice(),
                rideRequestDto.getAcceptedPrice(),
                rideRequestDto.getTimestamp(),
                rideRequestDto.getPaymentmethod());

        return rideRequest;
    }


    public static RideRequestDto mapToRideDto(RideRequest rideRequest){

        RideRequestDto rideRequestDto= new RideRequestDto(rideRequest.getId(),
                rideRequest.getPickUpLocation(),
                rideRequest.getDropLocation(),
                rideRequest.getStatus(),
                rideRequest.getDriver(),
                rideRequest.getRider(),
                rideRequest.getOfferedPrice(),
                rideRequest.getAcceptedPrice(),
                rideRequest.getTimestamp(),
                rideRequest.getPaymentmethod());

        return rideRequestDto;
    }
}
