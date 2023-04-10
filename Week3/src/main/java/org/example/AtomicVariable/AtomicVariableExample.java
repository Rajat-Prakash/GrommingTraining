package org.example.AtomicVariable;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableExample {
    static int x=0;
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(0);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
                x++;
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
                x++;
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count value: " + count.get());
        System.out.println("x : " + x);
    }
}

