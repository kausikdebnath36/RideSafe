package com.debnath.RideSafe.Entity;

import com.debnath.RideSafe.Enum.PaymentMethod;
import com.debnath.RideSafe.Enum.RideStatus;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tbltriderequest")
public class RideRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pickUpLocation;

    private String dropLocation;

    private RideStatus status;

    private User rider;

    private User user;

    private Integer offeredPrice;

    @Nullable
    private Integer acceptedPrice;

    private LocalDateTime timestamp;

    private PaymentMethod paymentmethod;
}
