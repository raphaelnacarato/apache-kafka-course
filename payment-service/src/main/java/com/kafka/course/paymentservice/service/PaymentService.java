package com.kafka.course.paymentservice.service;

import com.kafka.course.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
