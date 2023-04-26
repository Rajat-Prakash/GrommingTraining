package org.example.ChainOfResponsibilityDesignPattern.ConcreteHandler;

import org.example.ChainOfResponsibilityDesignPattern.PriceHandler;

public class ShippingCheck implements PriceHandler {
    private PriceHandler nextHandler;

    public void setNext(PriceHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public double processPrice(double price) {
        double shippingPrice = price + 50;
        if (nextHandler != null) {
            return nextHandler.processPrice(shippingPrice);
        }
        return shippingPrice;
    }
}
