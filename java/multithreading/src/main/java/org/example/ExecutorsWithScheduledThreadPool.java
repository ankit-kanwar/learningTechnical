package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsWithScheduledThreadPool {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

        scheduledExecutorService.schedule(new Task(),10, TimeUnit.SECONDS);

        //scheduledExecutorService.scheduleAtFixedRate(new Task(),5,2,TimeUnit.SECONDS);

        //scheduledExecutorService.scheduleWithFixedDelay(new Task(),5,2,TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();

    }

    static class Task implements Runnable{
        @Override
        public void run() {
            System.out.println("Task chali");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
