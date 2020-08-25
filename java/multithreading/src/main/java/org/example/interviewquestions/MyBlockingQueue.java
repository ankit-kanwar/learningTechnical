package org.example.interviewquestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {

    private int max=16;
    private Queue<E> queue;
    private ReentrantLock lock = new ReentrantLock(true);
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    public MyBlockingQueue(int size) {
        this.queue = new LinkedList<>();
        this.max = size;
    }


    public void put(E e) throws InterruptedException {
        lock.lock();
        try {
            while(queue.size() == max){
                notFull.await();
            }
            queue.add(e);
            notEmpty.signalAll();
        }finally {
            lock.unlock();
        }
    }


    public E take() throws InterruptedException {
        lock.lock();
        try{
            while(queue.size() == 0){
               notEmpty.await();
            }
            E item = queue.remove();
            notFull.signalAll();
            return item;
        }finally {
            lock.unlock();
        }
    }
}
