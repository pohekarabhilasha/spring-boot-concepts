package com.abhilasha.spring_boot_concepts.container;

import com.abhilasha.spring_boot_concepts.ioc.CardPayment;
import com.abhilasha.spring_boot_concepts.ioc.PaymentMethod;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ContainerDemoRunner implements CommandLineRunner {

    // ApplicationContext IS the Spring container. Spring injects it here.
    private final ApplicationContext context;

    public ContainerDemoRunner(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) {
        System.out.println("======= Spring Container Demo =======");

        // 1. Ask the container for a bean by its TYPE
        CardPayment card = context.getBean(CardPayment.class);
        System.out.println("Got bean by type: " + card.pay(50));

        // 2. Ask the container for a bean by its NAME
        //    (a @Component's default name is the class name with a lowercase first letter)
        PaymentMethod wallet = (PaymentMethod) context.getBean("walletPayment");
        System.out.println("Got bean by name: " + wallet.pay(75));

        // 3. How many beans is the container managing in total?
        System.out.println("Total beans in container: " + context.getBeanDefinitionCount());

        System.out.println("The container created and holds all these beans. I just asked for them.");
        System.out.println("=====================================");
    }
}