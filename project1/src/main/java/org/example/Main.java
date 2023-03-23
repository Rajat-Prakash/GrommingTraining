package org.example;

import org.example.CompilePolymorphism.Child1;
import org.example.CompilePolymorphism.Child2;
import org.example.CompilePolymorphism.Parent;
import org.example.Enum.Helper;
import org.example.EnumImplementsInterface.Day;
import org.example.RuntimePolymorphism.RuntimePoly;

public class Main {
    public static void main(String[] args) {

    // 1. Runtime Polymorphism
        System.out.println(RuntimePoly.add(12,14));
        System.out.println(RuntimePoly.add(12,14,16));
        System.out.println(RuntimePoly.add(12.35f,14.89f));

    // 2. Compile Polymorphism
        Parent p=new Parent();
        p.print();
        p=new Child1();
        p.print();
        p=new Child2();
        p.print();


    // 3. program for an Enum which has private constructor  which accepts two args
        Helper h=Helper.A1;
        System.out.println(h.getElement());


    // 4. Enum implement interface
        System.out.println("It is day number "
                + Day.Thursday.day()
                + " of a week.");

    }
}