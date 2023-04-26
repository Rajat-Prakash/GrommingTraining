package org.example.StrategyDesignPattern.ConcreteStrategy;

import org.example.StrategyDesignPattern.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println(amount + " paid using credit card");
    }
}
