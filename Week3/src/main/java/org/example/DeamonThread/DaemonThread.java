package org.example.DeamonThread;

public class DaemonThread {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is running");
            }
        });

        daemonThread.setDaemon(true);
        daemonThread.start();
        if (daemonThread.isDaemon()) {
            System.out.println("The thread is a daemon thread.");
        } else {
            System.out.println("The thread is not a daemon thread.");
        }

        System.out.println("Main thread is exiting");
    }
}

