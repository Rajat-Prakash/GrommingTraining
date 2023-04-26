package org.example.AbstractFactoryPattern.ConcreteProduct;

import org.example.AbstractFactoryPattern.Product.Vehicle;

public class PetrolCar implements Vehicle {
    @Override
    public void start() {
        System.out.println("Petrol Car started!");
    }
}
