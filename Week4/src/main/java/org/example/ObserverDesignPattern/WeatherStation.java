package org.example.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private final List<Observer> observers = new ArrayList<>();
    private double temperature;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
