package org.example.AutoboxingAndUnboxing;

public class Main {
    public static void main(String[] args){
        // What is Autoboxing and unboxing in java, write a program.

        Integer i = new Integer(10);

        // Unboxing the Object
        int i1 = i;

        // Print statements
        System.out.println("Value of i:" + i);
        System.out.println("Value of i1: " + i1);

        // Autoboxing of character
        Character character = 'a';
        char ch = character;

        // Print statements
        System.out.println("Value of ch: " + ch);
        System.out.println(" Value of character: " + character);
    }
}
