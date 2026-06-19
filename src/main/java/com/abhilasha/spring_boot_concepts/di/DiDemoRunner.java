package com.abhilasha.spring_boot_concepts.di;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DiDemoRunner implements CommandLineRunner {

    private final NotificationService notificationService;

    public DiDemoRunner(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void run(String... args) {
        System.out.println("=========== DI Demo ===========");
        System.out.println(notificationService.sendDefault("Welcome!"));      // @Primary -> Email
        System.out.println(notificationService.sendSms("Your OTP is 1234"));  // @Qualifier -> SMS
        System.out.println("===============================");
    }
}