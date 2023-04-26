package org.example.ChainOfResponsibilityDesignPattern.ConcreteHandler;

import org.example.ChainOfResponsibilityDesignPattern.PriceHandler;

public class ProductAvailabilityCheck implements PriceHandler {
    private PriceHandler nextHandler;

    public void setNext(PriceHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public double processPrice(double price) {
        if (price < 500) {
            System.out.println("Total amount is less than 500");
            return -1;
        }
        if (nextHandler != null) {
            return nextHandler.processPrice(price);
        }
        return price;
    }
}
