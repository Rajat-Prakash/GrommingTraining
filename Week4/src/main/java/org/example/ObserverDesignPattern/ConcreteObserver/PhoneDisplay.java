package org.example.ObserverDesignPattern.ConcreteObserver;

import org.example.ObserverDesignPattern.Observer;

public class PhoneDisplay implements Observer {
    private double temperature;

    public void update(double temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Temperature on phone display: " + temperature);
    }
}
