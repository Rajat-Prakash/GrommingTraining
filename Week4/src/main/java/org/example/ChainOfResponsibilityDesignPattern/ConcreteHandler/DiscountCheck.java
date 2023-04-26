package org.example.ChainOfResponsibilityDesignPattern.ConcreteHandler;

import org.example.ChainOfResponsibilityDesignPattern.PriceHandler;

public class DiscountCheck implements PriceHandler {
    private PriceHandler nextHandler;

    public void setNext(PriceHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public double processPrice(double price) {
        double discountPrice = price * 0.9;
        if (nextHandler != null) {
            return nextHandler.processPrice(discountPrice);
        }
        return discountPrice;
    }
}
