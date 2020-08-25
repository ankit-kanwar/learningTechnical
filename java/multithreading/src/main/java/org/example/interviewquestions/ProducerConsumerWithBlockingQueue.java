package org.example.interviewquestions;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerWithBlockingQueue {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingDeque = new ArrayBlockingQueue<>(10);

        //producer
        final Runnable producer = () -> {
            while(true){
                try {
                    blockingDeque.put(createMessage());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(producer).start();
        new Thread(producer).start();

        //consumer
        final Runnable consumer = () -> {
            while(true){
                try {
                    String msg = blockingDeque.take();
                    System.out.println(msg);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(consumer).start();
        new Thread(consumer).start();

        Thread.sleep(10000);

    }

    private static String createMessage() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;

        return new Random().ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

    }
}
