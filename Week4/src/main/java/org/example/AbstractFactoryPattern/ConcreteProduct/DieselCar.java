package org.example.AbstractFactoryPattern.ConcreteProduct;

import org.example.AbstractFactoryPattern.Product.Vehicle;

public class DieselCar implements Vehicle {
    @Override
    public void start() {
        System.out.println("Diesel Car started!");
    }
}
