package org.example.SOLID;

public class Main {
    public static void main(String[] args) {
        double num1 = 50;
        double num2 = 5;

        // Addition
        Calculator calculator = new Calculator(new Addition());
        System.out.println("Addition: " + calculator.calculate(num1, num2));

        // Subtraction
        calculator = new Calculator(new Subtraction());
        System.out.println("Subtraction: " + calculator.calculate(num1, num2));

        // Multiplication
        calculator = new Calculator(new Multiplication());
        System.out.println("Multiplication: " + calculator.calculate(num1, num2));

        // Division
        calculator = new Calculator(new Division());
        System.out.println("Division: " + calculator.calculate(num1, num2));
    }
}
