package org.example.ObserverDesignPattern.ConcreteObserver;

import org.example.ObserverDesignPattern.Observer;

public class TVDisplay implements Observer {
    private double temperature;

    public void update(double temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Temperature on TV display: " + temperature);
    }
}
