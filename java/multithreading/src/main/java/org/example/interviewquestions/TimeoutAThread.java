package org.example.interviewquestions;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class TimeoutAThread {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.schedule( () -> {
            task.stop();
            //thread.stop();
        },3, TimeUnit.SECONDS);
        executorService.shutdown();

    }

    private static class Task implements Runnable {

        public AtomicBoolean keepRunning = new AtomicBoolean(true);
        @Override
        public void run()  {
            while(keepRunning.get() == true){
                System.out.println("running");
            }
        }

        public void stop(){
            this.keepRunning.set(false);
        }
    }
}
