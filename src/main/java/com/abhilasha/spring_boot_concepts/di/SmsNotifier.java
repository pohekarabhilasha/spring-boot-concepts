package com.abhilasha.spring_boot_concepts.di;

import org.springframework.stereotype.Component;

@Component
public class SmsNotifier implements Notifier {
    @Override
    public String send(String message) {
        return "SMS sent: " + message;
    }
}