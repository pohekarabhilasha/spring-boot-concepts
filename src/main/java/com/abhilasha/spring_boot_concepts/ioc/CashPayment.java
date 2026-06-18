package com.abhilasha.spring_boot_concepts.ioc;

import org.springframework.stereotype.Component;

@Component
public class CashPayment implements PaymentMethod {
    @Override
    public String pay(double amount) {
        return "Paid " + amount + " using Cash";
    }
}