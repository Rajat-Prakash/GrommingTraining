package org.example.FixedThreadPool;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<Integer> {
    private final int number;

    public Task(int number) {
        this.number = number;
    }

    public Integer call() throws Exception {
        Thread.sleep(1000);
        return number * number;
    }


    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        List<Future<Integer>> resultList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Future<Integer> result = executor.submit(new Task(i));
            resultList.add(result);
        }

        for (Future<Integer> future : resultList) {
            try {
                Integer result = future.get();
                System.out.println("Result: " + result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}


