package org.example.parallelStreams;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class StreamParallelPerf {
    public static void main(String[] args) {
        Instant before = Instant.now();

        int total = IntStream.of(3,1,4)
                 .parallel()
                 .map(StreamParallelPerf::doubleIt)
                 .sum();

        Instant after = Instant.now();

        Duration duration = Duration.between(before,after);
        System.out.println("Total of doubles:"+ total);
        System.out.println("Time taken:"+duration.toMillis()+" ms");
    }

    public static int doubleIt(int n){
        try {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName() + " with n = "+n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return n*2;
    }
}
