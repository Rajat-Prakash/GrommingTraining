package org.example.ObserverDesignPattern;

import org.example.ObserverDesignPattern.ConcreteObserver.PhoneDisplay;
import org.example.ObserverDesignPattern.ConcreteObserver.TVDisplay;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation();
        PhoneDisplay phone=new PhoneDisplay();
        TVDisplay tv=new TVDisplay();
        weatherStation.registerObserver(phone);
        weatherStation.registerObserver(tv);
        weatherStation.setTemperature(30);
        weatherStation.removeObserver(tv);
        weatherStation.setTemperature(28);
    }
}
