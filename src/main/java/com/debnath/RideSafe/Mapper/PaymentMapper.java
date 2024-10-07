package com.debnath.RideSafe.Mapper;

import com.debnath.RideSafe.Dto.PaymentDto;
import com.debnath.RideSafe.Entity.Payment;


public class PaymentMapper {

    public static Payment mapToPayment(PaymentDto paymentdto){
        Payment payment= new Payment(paymentdto.getPaymentId(),
                paymentdto.getUserId(),
                paymentdto.getRiderId(),
                paymentdto.getAmount(),
                paymentdto.getPaymentMethod(),
                paymentdto.getPaymentStatus());
        return payment;
    }

    public static PaymentDto mapToPaymentdto(Payment payment){
        PaymentDto paymentDto= new PaymentDto(payment.getPaymentId(),
                payment.getUserId(),
                payment.getRiderId(),
                payment.getAmount(),
                payment.getPaymentMethod(),
                payment.getPaymentStatus());
        return paymentDto;
    }
}
