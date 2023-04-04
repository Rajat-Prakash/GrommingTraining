package org.example.SOLID;

public class Calculator {
    private BasicOperation operation;

    public Calculator(BasicOperation operation) {
        this.operation = operation;
    }

    public double calculate(double num1, double num2) {
        return operation.perform(num1, num2);
    }
}
