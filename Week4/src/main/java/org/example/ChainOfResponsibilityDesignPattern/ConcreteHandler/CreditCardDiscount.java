package org.example.ChainOfResponsibilityDesignPattern.ConcreteHandler;

import org.example.ChainOfResponsibilityDesignPattern.PriceHandler;

public class CreditCardDiscount implements PriceHandler {
    PriceHandler nextHandler;
    @Override
    public void setNext(PriceHandler nextHandler) {
        this.nextHandler=nextHandler;
    }

    @Override
    public double processPrice(double price) {
        double finalPrice=price*0.95;
        if(nextHandler!=null)
        {
            nextHandler.processPrice(finalPrice);
        }
        return finalPrice;
    }
}
