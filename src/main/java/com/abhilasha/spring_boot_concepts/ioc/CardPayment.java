package com.abhilasha.spring_boot_concepts.ioc;

import org.springframework.stereotype.Component;

// @Component makes this a Spring-managed bean.
@Component
public class CardPayment implements PaymentMethod {
    @Override
    public String pay(double amount) {
        return "Paid " + amount + " using Card";
    }
}