package org.example.TemplateDesignPattern;

public abstract class HouseTemplate {
    public final void buildHouse() {
        buildFoundation();
        buildWalls();
        buildRoof();
        paintHouse();
    }

    // These methods are to be implemented by subclasses
    public abstract void buildFoundation();
    public abstract void buildWalls();
    public abstract void buildRoof();

    // This method is optional and can be overridden by subclasses
    public void paintHouse() {
        System.out.println("Painting the house");
    }
}
