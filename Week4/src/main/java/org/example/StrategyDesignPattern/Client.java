package org.example.StrategyDesignPattern;

import org.example.StrategyDesignPattern.ConcreteStrategy.CreditCardStrategy;

public class Client {
    public static void main(String[] args) {
        PaymentContext context=new PaymentContext();
        context.setStrategy(new CreditCardStrategy());
        context.pay(1000);
    }
}
