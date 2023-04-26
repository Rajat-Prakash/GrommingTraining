package org.example.DecoratorDesignPattern.Decorator;

import org.example.DecoratorDesignPattern.Shape;

import java.util.DoubleSummaryStatistics;

public class RedBorderShape extends ShapeDecorator {
    public RedBorderShape(Shape decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color : Red ");
    }
}
