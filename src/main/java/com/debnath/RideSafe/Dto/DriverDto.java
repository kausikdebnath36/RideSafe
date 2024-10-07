package com.debnath.RideSafe.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DriverDto {
    private Long riderId;

    private String vehicleId;

    private char vehicleType;

    private String currentLocation;

    private String availability;

    private Long totalIncome;

    private Long due;

    private int settlementId;

    public DriverDto(Long riderId, String vehicleId, char vehicleType, String currentLocation, String availability, Long totalIncome, Long due, int settlementId) {
        this.riderId = riderId;
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.currentLocation = currentLocation;
        this.availability = availability;
        this.totalIncome = totalIncome;
        this.due = due;
        this.settlementId = settlementId;
    }
}
