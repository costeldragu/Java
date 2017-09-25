package com.mdc.enva.Threads.javaPatternsConcurrencyMultiThreading;

import org.junit.Test;

public class DeadLockTest {

    @Test
    public void testDeadLook() throws InterruptedException {
        DeadLock deadLock = new DeadLock();

        Runnable r1 = () -> deadLock.a();
        Runnable r2 = () -> deadLock.b();

        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r2);
        t2.start();

        t1.join();
        t2.join();
    }
}
