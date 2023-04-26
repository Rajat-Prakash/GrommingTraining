package org.example.DecoratorDesignPattern.Decorator;

import org.example.DecoratorDesignPattern.Shape;

public abstract class ShapeDecorator implements Shape{
    Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape=decoratedShape;
    }
    public void draw(){
        decoratedShape.draw();
    }
}
