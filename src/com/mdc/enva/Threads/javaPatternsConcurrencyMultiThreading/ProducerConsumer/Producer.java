package com.mdc.enva.Threads.javaPatternsConcurrencyMultiThreading.ProducerConsumer;


public class Producer {
    private Object lock;
    private static final int BUFFER_SIZE = 500;
    int count = 0;
    int[] buffer = new int[BUFFER_SIZE];

    public void produce() throws InterruptedException {
        synchronized (lock) {
            if (buffer.length == BUFFER_SIZE - 1) lock.wait();


            lock.notifyAll();
        }
//        while ()
    }
}
