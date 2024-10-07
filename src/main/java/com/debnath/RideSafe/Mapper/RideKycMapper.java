package com.debnath.RideSafe.Mapper;

import com.debnath.RideSafe.Dto.RiderKycDto;
import com.debnath.RideSafe.Entity.RiderKyc;

public class RideKycMapper {

    public static RiderKyc mapToRideKyc(RiderKycDto riderKycDto){
        RiderKyc riderKyc= new RiderKyc(riderKycDto.getVehicleId(),
                riderKycDto.getVehicleNo(),
                riderKycDto.getRiderId(),
                riderKycDto.getRcPath(),
                riderKycDto.getLivePhotoPath(),
                riderKycDto.getKycStatus(),
                riderKycDto.getKycFee(),
                riderKycDto.getVehicleType());

        return riderKyc;
    }

    public static RiderKycDto mapToRideKycDto(RiderKyc riderKyc){
        RiderKycDto riderKycDto= new RiderKycDto(riderKyc.getVehicleId(),
                riderKyc.getVehicleNo(),
                riderKyc.getRiderId(),
                riderKyc.getRcPath(),
                riderKyc.getLivePhotoPath(),
                riderKyc.getKycStatus(),
                riderKyc.getKycFee(),
                riderKyc.getVehicleType());

        return riderKycDto;
    }
}
