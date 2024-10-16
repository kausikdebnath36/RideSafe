package com.debnath.RideSafe.Dto;

import com.debnath.RideSafe.Entity.User;
import com.debnath.RideSafe.Enum.RideStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class RideRequestDto {
    private Long id;

    private String pickUpLocation;

    private String dropLocation;

    @Enumerated(EnumType.STRING)
    private RideStatus status;

    private User riderId;

    private User userId;

    private int offeredPrice;

    private int acceptedPrice;

    private Date timestamp;

    private Long paymentId;

    public RideRequestDto(Long id, String pickUpLocation, String dropLocation, RideStatus status, User riderId, User userId, int offeredPrice, int acceptedPrice, Date timestamp, Long paymentId) {
        this.id = id;
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
        this.status = status;
        this.riderId = riderId;
        this.userId = userId;
        this.offeredPrice = offeredPrice;
        this.acceptedPrice = acceptedPrice;
        this.timestamp = timestamp;
        this.paymentId = paymentId;
    }
}
