package org.example.AbstractFactoryPattern.ConcreteCreators;

import org.example.AbstractFactoryPattern.ConcreteProduct.DieselCar;
import org.example.AbstractFactoryPattern.ConcreteProduct.DieselTruck;
import org.example.AbstractFactoryPattern.Creators.VehicleFactory;
import org.example.AbstractFactoryPattern.Product.Vehicle;

public class DieselVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle createCar() {
        return new DieselCar();
    }

    @Override
    public Vehicle createTruck() {
        return new DieselTruck();
    }
}
