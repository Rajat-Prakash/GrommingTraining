package org.example.ClassLevelLock;

class ClassLevelLock {
    public static synchronized void method1() {
        System.out.println("Method 1 is running.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Method 1 is done.");
    }

    public static synchronized void method2() {
        System.out.println("Method 2 is running.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Method 2 is done.");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> ClassLevelLock.method1());

        Thread thread2 = new Thread(() -> ClassLevelLock.method2());

        thread1.start();
        thread2.start();
    }
}

