package org.example.TemplateDesignPattern.ConcreteTemplates;

import org.example.TemplateDesignPattern.HouseTemplate;

public class ConcreteHouse extends HouseTemplate {
    @Override
    public void buildFoundation() {
        System.out.println("Building foundation with concrete and steel");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building concrete walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("Building concrete roof");
    }

    // Override optional method
    @Override
    public void paintHouse() {
        System.out.println("Painting the concrete house");
    }
}
