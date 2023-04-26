package org.example.FacadeDesign;

public class PaymentService {
    void payment(String paymentMethod,int amount){
        System.out.println("Payment of Rs. "+amount+" is done successfully through " + paymentMethod);
    }
}
