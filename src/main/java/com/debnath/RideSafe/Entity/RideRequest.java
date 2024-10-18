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
@Table(name="Riderequest")
public class RideRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "req_id")
    private Long id;

    @Column(name= "pickup_location")
    private String pickUpLocation;

    @Column(name= "mdrop_location")
    private String dropLocation;

    @Column(name= "status",length = 255)
    private RideStatus status;

    @ManyToOne
    @JoinColumn(name = "driver_id",nullable = true)
    private User driver;

    @ManyToOne
    @JoinColumn(name = "rider_id")
    private User rider;

    @Column(name= "offered_price",nullable = true)
    private Integer offeredPrice;


    @Column(name= "accepted_price",nullable = true)
    private Integer acceptedPrice;

    @Column(name= "request_time",nullable = true)
    private LocalDateTime timestamp;

    @Column(name= "payment_Method",nullable = true)
    private PaymentMethod paymentmethod;
}
