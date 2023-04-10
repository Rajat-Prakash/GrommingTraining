package org.example.SemaphoreAndThreadLocal;

import java.util.concurrent.Semaphore;

public class SemaphoreAndThreadLocal {

    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {

        Semaphore semaphore = new Semaphore(5);

        for (int i = 1; i <= 10; i++) {
            int threadId = i;
            new Thread(() -> {
                try {
                    semaphore.acquire();

                    threadLocal.set(threadId);

                    System.out.println("Thread " + threadLocal.get() + " (" + Thread.currentThread().getName() + ") is running");

                    Thread.sleep(1000);

                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

