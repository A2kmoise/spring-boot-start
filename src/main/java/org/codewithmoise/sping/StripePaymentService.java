package org.codewithmoise.sping;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Primary
//@Service("stripe")
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiUrl}")
    private String appUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.supported-currency}")
    private List<String> currencies;

    @Value("${stripe.timeout}")
    private int timeout;

    @Override
    public void processPayment(double amount){
        System.out.println("Host: "  + appUrl);
        System.out.println("Enabled: " + enabled);
        System.out.println("Currency: " + currencies);
        System.out.println("Time: " + timeout);
        System.out.println("STRIPE");
        System.out.println("Amount: "+ amount + "paid");
    }
}
