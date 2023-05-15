package org.example.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class BlockingQueueExample {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
        Thread producer = new Thread(() -> {
            try {
                AtomicInteger i=new AtomicInteger(1);
                while (true) {
                    String message = "Produced message " +i;
                    i.incrementAndGet();
                    queue.put(message); // Blocks if queue is full
                    System.out.println("Produced: " + message);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    String message = queue.take(); // Blocks if queue is empty
                    System.out.println("Consumed: " + message);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}

