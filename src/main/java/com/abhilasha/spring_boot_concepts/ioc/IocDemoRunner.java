package com.abhilasha.spring_boot_concepts.ioc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IocDemoRunner implements CommandLineRunner {

    private final List<PaymentMethod> paymentMethods;

    // Spring finds ALL beans of type PaymentMethod (Card, Wallet, Cash)
    // and injects all of them here as a list. I never wrote 'new'.
    public IocDemoRunner(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    @Override
    public void run(String... args) {
        System.out.println("=========== IoC Demo ===========");
        for (PaymentMethod method : paymentMethods) {
            System.out.println(method.pay(100));
        }
        System.out.println("Spring created and wired all 3 payment beans. No 'new' anywhere.");
        System.out.println("================================");
    }
}