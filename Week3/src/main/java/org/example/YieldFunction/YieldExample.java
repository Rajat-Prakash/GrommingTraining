package org.example.YieldFunction;

public class YieldExample implements Runnable {

    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " started.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " running.");
            try {
                Thread.sleep(1000);
                Thread.yield();             //Yield function
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " finished.");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new YieldExample(), "Thread 1");
        Thread t2 = new Thread(new YieldExample(), "Thread 2");
        t1.start();
        t2.start();
    }
}

