package org.example.SOLID;

public class Division implements BasicOperation{
    public double perform(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}
