package org.example;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsWithIdealPoolSizeForCPUIntensiveTask {

    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(coreCount);
        for(int i=0;i<10;i++){
            executorService.execute(new CPUIntensiveTask());
        }
        System.out.println("Thread name:"+Thread.currentThread().getName());

    }

    static class CPUIntensiveTask implements Runnable{

        @Override
        public void run() {
            System.out.println("Thread name:"+Thread.currentThread().getName());
        }
    }
}


