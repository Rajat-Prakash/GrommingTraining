package org.example.AbstractFactoryPattern.ConcreteProduct;

import org.example.AbstractFactoryPattern.Product.Vehicle;

public class PetrolTruck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Petrol Truck started!");
    }
}
