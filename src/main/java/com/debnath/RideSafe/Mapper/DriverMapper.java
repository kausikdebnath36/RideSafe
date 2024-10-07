package com.debnath.RideSafe.Mapper;

import com.debnath.RideSafe.Dto.DriverDto;
import com.debnath.RideSafe.Entity.Driver;

public class DriverMapper {

    public static Driver mapToDriver(DriverDto driverDto){
        Driver driver= new Driver(driverDto.getRiderId(),
                driverDto.getVehicleId(),
                driverDto.getVehicleType(),
                driverDto.getCurrentLocation(),
                driverDto.getAvailability(),
                driverDto.getTotalIncome(),
                driverDto.getDue(),
                driverDto.getSettlementId());
        return driver;
    }

    public static DriverDto mapToDriverdto(DriverDto driver){
        DriverDto driverdto= new DriverDto(driver.getRiderId(),
                driver.getVehicleId(),
                driver.getVehicleType(),
                driver.getCurrentLocation(),
                driver.getAvailability(),
                driver.getTotalIncome(),
                driver.getDue(),
                driver.getSettlementId());
        return driverdto;
    }
}
