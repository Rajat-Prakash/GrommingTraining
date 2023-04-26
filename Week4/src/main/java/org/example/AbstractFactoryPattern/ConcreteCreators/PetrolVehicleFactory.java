package org.example.AbstractFactoryPattern.ConcreteCreators;

import org.example.AbstractFactoryPattern.ConcreteProduct.PetrolCar;
import org.example.AbstractFactoryPattern.ConcreteProduct.PetrolTruck;
import org.example.AbstractFactoryPattern.Creators.VehicleFactory;
import org.example.AbstractFactoryPattern.Product.Vehicle;

public class PetrolVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle createCar() {
        return new PetrolCar();
    }

    @Override
    public Vehicle createTruck() {
        return new PetrolTruck();
    }
}
