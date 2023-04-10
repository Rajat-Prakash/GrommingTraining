package org.example.PrioritySetForThreads;


public class MyThread implements Runnable {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " priority is: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread(),"Thread 1");
        Thread thread2 = new Thread(new MyThread(),"Thread 2");
        Thread thread3 = new Thread(new MyThread(),"Thread 3");

        thread1.setPriority(10);
        thread2.setPriority(1);
        thread3.setPriority(4);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

