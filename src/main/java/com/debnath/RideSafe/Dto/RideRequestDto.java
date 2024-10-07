package com.debnath.RideSafe.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class RideRequestDto {
    private Long id;

    private String pickUpLocation;

    private String dropLocation;

    private String status;

    private Long riderId;

    private Long userId;

    private int offeredPrice;

    private int acceptedPrice;

    private Date timestamp;

    private Long paymentId;

    public RideRequestDto(Long id, String pickUpLocation, String dropLocation, String status, Long riderId, Long userId, int offeredPrice, int acceptedPrice, Date timestamp, Long paymentId) {
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
