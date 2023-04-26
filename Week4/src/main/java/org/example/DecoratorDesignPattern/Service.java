package org.example.DecoratorDesignPattern;

import org.example.DecoratorDesignPattern.Decorator.RedBorderShape;

public class Service {
    public static void main(String[] args) {
        Shape circle=new Circle();
        circle.draw();
        Shape redCircle=new RedBorderShape(new Circle());
        redCircle.draw();
    }
}
