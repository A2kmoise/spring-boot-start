package org.codewithmoise.sping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


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
    @Scope("prototype")
    public OrderService orderService(){
        return new OrderService(stripe());
    }

}
