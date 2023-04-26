package org.example.AbstractFactoryPattern;

import org.example.AbstractFactoryPattern.ConcreteCreators.PetrolVehicleFactory;
import org.example.AbstractFactoryPattern.ConcreteCreators.DieselVehicleFactory;
import org.example.AbstractFactoryPattern.Creators.VehicleFactory;
import org.example.AbstractFactoryPattern.Product.Vehicle;

public class Service {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory=new PetrolVehicleFactory();
        Vehicle vehicle =vehicleFactory.createCar();
        vehicle.start();

        vehicleFactory=new DieselVehicleFactory();
        vehicle=vehicleFactory.createTruck();
        vehicle.start();
    }
}
