package org.example.TemplateDesignPattern.ConcreteTemplates;

import org.example.TemplateDesignPattern.HouseTemplate;

public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildFoundation() {
        System.out.println("Building foundation with wood, brick, and stone");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building wooden walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("Building wooden roof");
    }
}
