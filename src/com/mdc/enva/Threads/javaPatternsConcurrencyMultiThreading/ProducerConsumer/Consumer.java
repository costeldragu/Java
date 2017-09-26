package com.mdc.enva.Threads.javaPatternsConcurrencyMultiThreading.ProducerConsumer;

public class Consumer {
    private Object lock;
    private static final int BUFFER_SIZE = 500;
    int count = 0;
    int[] buffer = new int[BUFFER_SIZE];
    public void consume() throws InterruptedException {
        synchronized (lock) {
          if(buffer.length == 0) lock.wait();
          lock.notifyAll();

        }
    }
}
