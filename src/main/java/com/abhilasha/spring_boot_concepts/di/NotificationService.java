package com.abhilasha.spring_boot_concepts.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final Notifier defaultNotifier;   // gets the @Primary bean (Email)
    private final Notifier smsNotifier;        // @Qualifier picks SMS specifically

    // Constructor injection. No @Autowired needed (single constructor, Spring 4.3+).
    public NotificationService(Notifier defaultNotifier,
                               @Qualifier("smsNotifier") Notifier smsNotifier) {
        this.defaultNotifier = defaultNotifier;
        this.smsNotifier = smsNotifier;
    }

    public String sendDefault(String message) {
        return defaultNotifier.send(message);
    }

    public String sendSms(String message) {
        return smsNotifier.send(message);
    }
}