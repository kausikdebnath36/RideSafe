package com.debnath.RideSafe.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RiderKycDto {

    private Long vehicleId;

    private String vehicleNo;

    private Long riderId;

    private String rcPath;

    private String livePhotoPath;

    private String kycStatus;

    private String kycFee;

    private char vehicleType;

    public RiderKycDto(Long vehicleId, String vehicleNo, Long riderId, String rcPath, String livePhotoPath, String kycStatus, String kycFee, char vehicleType) {
        this.vehicleId = vehicleId;
        this.vehicleNo = vehicleNo;
        this.riderId = riderId;
        this.rcPath = rcPath;
        this.livePhotoPath = livePhotoPath;
        this.kycStatus = kycStatus;
        this.kycFee = kycFee;
        this.vehicleType = vehicleType;
    }
}
