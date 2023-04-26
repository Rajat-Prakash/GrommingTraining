package org.example.StrategyDesignPattern.ConcreteStrategy;

import org.example.StrategyDesignPattern.PaymentStrategy;

public class NetBankingStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid using Net Banking");
    }
}
