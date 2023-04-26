package org.example.TemplateDesignPattern;

import org.example.TemplateDesignPattern.ConcreteTemplates.ConcreteHouse;
import org.example.TemplateDesignPattern.ConcreteTemplates.WoodenHouse;

public class Client {
    public static void main(String[] args) {
        HouseTemplate woodenHouse=new WoodenHouse();
        woodenHouse.buildHouse();
        HouseTemplate concreteHouse=new ConcreteHouse();
        concreteHouse.buildHouse();
    }
}
