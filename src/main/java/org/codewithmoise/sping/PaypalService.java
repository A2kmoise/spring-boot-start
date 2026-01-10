package org.codewithmoise.sping;

public class PaypalService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal");
        System.out.println("amount "+ amount + "paid");
    }
}
