package org.example.CountDownLatch;
import java.util.concurrent.CountDownLatch;

public class MainTask {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        new Thread(new SubTask(latch, "Subtask 1")).start();
        new Thread(new SubTask(latch, "Subtask 2")).start();
        new Thread(new SubTask(latch, "Subtask 3")).start();

        latch.await();

        System.out.println("Starting main task");
    }

    private static class SubTask implements Runnable {
        private final CountDownLatch latch;
        private final String name;

        public SubTask(CountDownLatch latch, String name) {
            this.latch = latch;
            this.name = name;
        }

        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println(name + " has completed its work");

                latch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
