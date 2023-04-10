package org.example.CreateAThread;

public class CreateThread implements Runnable {

    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new CreateThread());
        System.out.println("Thread state: " + thread.getState());
        thread.start();
        System.out.println("Thread state: " + thread.getState());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread state: " + thread.getState());
    }
}
