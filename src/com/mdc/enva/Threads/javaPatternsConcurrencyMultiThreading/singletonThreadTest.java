package com.mdc.enva.Threads.javaPatternsConcurrencyMultiThreading;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class singletonThreadTest {
    @Test
    public void testWitoutSyncronize() throws InterruptedException {
        Runnable r1 = () -> {
            System.out.println("I am running in " + Thread.currentThread().getName());
            Singleton s = Singleton.getInstance();
        };

        Runnable r2 = () -> {
            System.out.println("I am running in " + Thread.currentThread().getName());
            Singleton s = Singleton.getInstance();
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(Singleton.intancesNumbers);
    }
}
