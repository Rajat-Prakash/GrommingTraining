package org.example.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    public static void main(String[] args) {
        Queue<Integer> buffer = new LinkedList<>();
        int maxSize = 1;

        Thread producerThread = new Thread(new Producer(buffer, maxSize));
        Thread consumerThread1 = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread1.start();
    }

    static class Producer implements Runnable {
        private Queue<Integer> buffer;
        private int maxSize;

        public Producer(Queue<Integer> buffer, int maxSize) {
            this.buffer = buffer;
            this.maxSize = maxSize;
        }

        public void run() {
            int i = 0;
            while (true) {
                synchronized (buffer) {
                    while (buffer.size() == maxSize) {
                        try {
                            System.out.println("Buffer is full, waiting...");
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    buffer.add(i);
                    System.out.println("Producing " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    i++;
                    buffer.notifyAll();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        private Queue<Integer> buffer;

        public Consumer(Queue<Integer> buffer) {
            this.buffer = buffer;
        }

        public void run() {
            while (true) {
                synchronized (buffer) {
                    while (buffer.isEmpty()) {
                        try {
                            System.out.println("Buffer is empty, waiting...");
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int val = buffer.poll();
                    System.out.println("Consuming " + val);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    buffer.notifyAll();
                }
            }
        }
    }
}

