package org.example.StateDesignPattern;

public class Client {
    public static void main(String[] args) {
        Context context=new Context();
        context.setAccountingState();
        context.open();
        context.log();
        context.update();
        context.close();

        context.setSalesState();
        context.open();
        context.log();
        context.update();
        context.close();
    }
}
