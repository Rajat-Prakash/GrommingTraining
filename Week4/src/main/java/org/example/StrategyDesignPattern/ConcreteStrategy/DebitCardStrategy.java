package org.example.StrategyDesignPattern.ConcreteStrategy;

import org.example.StrategyDesignPattern.PaymentStrategy;

public class DebitCardStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid using debit card");
    }
}
