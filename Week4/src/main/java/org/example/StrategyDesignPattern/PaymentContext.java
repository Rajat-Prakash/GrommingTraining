package org.example.StrategyDesignPattern;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    public void pay(double amount){
        paymentStrategy.pay(amount);
    }
}
