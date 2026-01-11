package org.codewithmoise.sping;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;



public class OrderService {

    private final PaymentService paymentService;

 public OrderService(@Qualifier("stripe") PaymentService paymentService){
     System.out.println("OrderService started");
     this.paymentService = paymentService;
   }

   @PostConstruct
   public void  init(){
       System.out.println("A bean Post Construct");
   }

   @PreDestroy
   public void cleanUp(){
       System.out.println("An OrderService Destroy");
   }
    public void placeOrder(){ // tight-coupled we can not test OrderService alone it should go with that Stripe payment which is not actually good it is solvable by using interfaces for dependency injection.
    //var paymentService = new StripePaymentService (removed)
    paymentService.processPayment(100);
    }

//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

}
