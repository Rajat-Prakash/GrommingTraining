package org.example.AbstractFactoryPattern.Creators;

import org.example.AbstractFactoryPattern.Product.Vehicle;

public  interface VehicleFactory {
    Vehicle createCar();
    Vehicle createTruck();
}
