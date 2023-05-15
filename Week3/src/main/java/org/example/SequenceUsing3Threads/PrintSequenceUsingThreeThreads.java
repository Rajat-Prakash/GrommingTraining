package org.example.SequenceUsing3Threads;

public class PrintSequenceUsingThreeThreads {
    private static int N = 10;
    private static int counter = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Printer(0));
        Thread t2 = new Thread(new Printer(1));
        Thread t3 = new Thread(new Printer(2));

        t1.start();
        t2.start();
        t3.start();
    }

    static class Printer implements Runnable {
        private final int id;

        public Printer(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    if (counter > N) {
                        break;
                    }
                    if (counter % 3 == id) {
                        System.out.println("Thread " + id + ": " + counter++);
                    }
                }
            }
        }
    }
}

