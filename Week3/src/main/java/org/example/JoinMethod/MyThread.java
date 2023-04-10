package org.example.JoinMethod;


public class MyThread implements Runnable {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " started.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread " + Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " finished.");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread(),"Thread 1");
        Thread thread2 = new Thread(new MyThread(),"Thread 2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}
