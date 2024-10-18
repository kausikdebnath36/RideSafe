package com.debnath.RideSafe.Dto;

import com.debnath.RideSafe.Entity.User;
import com.debnath.RideSafe.Enum.PaymentMethod;
import com.debnath.RideSafe.Enum.RideStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
public class RideRequestDto {
    private Long id;

    private String pickUpLocation;

    private String dropLocation;

    @Enumerated(EnumType.STRING)
    private RideStatus status;

    private User driverId;

    private User riderId;

    private int offeredPrice;

    private int acceptedPrice;

    private LocalDateTime timestamp;

    private PaymentMethod paymentmethod;

    public RideRequestDto(Long id, String pickUpLocation, String dropLocation, RideStatus status, User driverId, User riderId, int offeredPrice, int acceptedPrice, LocalDateTime timestamp, PaymentMethod paymentmethod) {
        this.id = id;
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
        this.status = status;
        this.driverId = driverId;
        this.riderId = riderId;
        this.offeredPrice = offeredPrice;
        this.acceptedPrice = acceptedPrice;
        this.timestamp = timestamp;
        this.paymentmethod= paymentmethod;
    }
}
