package com.abhilasha.spring_boot_concepts.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary   // the DEFAULT Notifier when no specific one is requested
public class EmailNotifier implements Notifier {
    @Override
    public String send(String message) {
        return "Email sent: " + message;
    }
}