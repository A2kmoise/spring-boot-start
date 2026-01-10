package org.codewithmoise.sping;


import org.springframework.stereotype.Service;

@Service("paypal")
public class PaypalService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal");
        System.out.println("amount "+ amount + "paid");
    }
}
