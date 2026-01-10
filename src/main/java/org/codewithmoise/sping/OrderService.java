package org.codewithmoise.sping;


public class OrderService {

    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService){
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){ // tight coupled we can not test OrderService alone it should go with that Stripe payment which is not actually good it is solvable by using interfaces for dependency injection.
    //var paymentService = new StripePaymentService(); (removed)
    paymentService.processPayment(100);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

}
