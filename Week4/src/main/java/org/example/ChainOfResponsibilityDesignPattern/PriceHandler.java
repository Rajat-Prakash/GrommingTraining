package org.example.ChainOfResponsibilityDesignPattern;

public interface PriceHandler {
    void setNext(PriceHandler priceHandler);
    double processPrice(double price);
}
