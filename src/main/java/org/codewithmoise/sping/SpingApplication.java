package org.codewithmoise.sping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpingApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpingApplication.class, args);
        var OrderService = new OrderService();
        OrderService.setPaymentService(new PaypalService());
        OrderService.placeOrder();
    }

}
