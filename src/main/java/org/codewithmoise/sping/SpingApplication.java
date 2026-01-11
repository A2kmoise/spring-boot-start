package org.codewithmoise.sping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(SpingApplication.class, args);
        var resource = context.getBean(HeavyResource.class);
        var OrderService = context.getBean(OrderService.class);;
        var NotificationManager = context.getBean(NotificationManager.class);
        OrderService.placeOrder();
        NotificationManager.sendMessage("hello");
        context.close();
    }

}
