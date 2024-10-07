package com.debnath.RideSafe.Entity;


import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tbltriderkyc")
public class RiderKyc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    private String vehicleNo;

    private Long riderId;

    private String rcPath;

    private String livePhotoPath;

    private String kycStatus;

    private String kycFee;

    private char vehicleType;


}
