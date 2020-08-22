package org.example;

import java.util.Random;
import java.util.concurrent.*;

public class ExeecutorsWithCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future<Integer> future = executorService.submit(new Task());

        System.out.println("In Main task submitted");

        for (int i = 0; i < 5; i++) {
            System.out.println("In Main unrelated processing displaying 1 to 5:"+i);
        }

        Integer result = future.get();
        System.out.println("In Main future result:"+result);

        executorService.shutdown();
        System.out.println("Thread name:"+Thread.currentThread().getName());

    }

    static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            Thread.sleep(3000);
            Integer random = new Random().nextInt();
            System.out.println("In task displaying random:"+random);
            return random;
        }
    }
}
