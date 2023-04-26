package org.example.ChainOfResponsibilityDesignPattern;

import org.example.ChainOfResponsibilityDesignPattern.ConcreteHandler.CreditCardDiscount;
import org.example.ChainOfResponsibilityDesignPattern.ConcreteHandler.DiscountCheck;
import org.example.ChainOfResponsibilityDesignPattern.ConcreteHandler.ProductAvailabilityCheck;
import org.example.ChainOfResponsibilityDesignPattern.ConcreteHandler.ShippingCheck;

public class PriceClient {
    public static void main(String[] args) {
        PriceHandler productAvailabilityCheck = new ProductAvailabilityCheck();
        PriceHandler discountCheck = new DiscountCheck();
        PriceHandler shippingCheck = new ShippingCheck();
        PriceHandler creditCartDiscount=new CreditCardDiscount();

        productAvailabilityCheck.setNext(discountCheck);
        discountCheck.setNext(shippingCheck);
        shippingCheck.setNext(creditCartDiscount);

        double finalPrice = productAvailabilityCheck.processPrice(600);
        System.out.println("Final price: " + finalPrice);
    }
}
