package org.example.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task implements Runnable {
    private final CyclicBarrier cyclicBarrier= new CyclicBarrier(3, () -> {
        System.out.println("All threads have reached the barrier point");
    });
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getName() + " is waiting at the barrier point");
            cyclicBarrier.await();
            System.out.println("Thread " + Thread.currentThread().getName() + " has passed the barrier point");
        } catch (InterruptedException | BrokenBarrierException e) {e.printStackTrace();}
    }
    public static void main(String[] args) {
        int numberOfThreads = 3;

        for (int i = 0; i < numberOfThreads; i++) {
            Thread t = new Thread(new Task(), "Thread" + (i + 1));
            t.start();
        }
    }
}