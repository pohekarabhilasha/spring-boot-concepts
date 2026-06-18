package com.abhilasha.spring_boot_concepts.ioc;

// One common type for all payment methods.
public interface PaymentMethod {
    String pay(double amount);
}