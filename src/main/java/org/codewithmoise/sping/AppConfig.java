package org.codewithmoise.sping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal(){
        return new PaypalService();
    }

    @Bean
    public OrderService orderService(){
        return new OrderService(stripe());
    }

}
