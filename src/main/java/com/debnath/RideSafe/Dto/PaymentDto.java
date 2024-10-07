package com.debnath.RideSafe.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PaymentDto {

    private Long paymentId;

    private Long userId;

    private Long riderId;

    private Long Amount;

    private String paymentMethod;

    private String paymentStatus;


    public PaymentDto(Long paymentId, Long userId, Long riderId, Long amount, String paymentMethod, String paymentStatus) {
        this.paymentId = paymentId;
        this.userId = userId;
        this.riderId = riderId;
        this.Amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }
}
