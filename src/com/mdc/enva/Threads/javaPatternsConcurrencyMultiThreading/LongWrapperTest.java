package com.mdc.enva.Threads.javaPatternsConcurrencyMultiThreading;

import org.junit.Test;

public class LongWrapperTest {
    @Test
    public void testNotSyncronized() throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);
        Runnable r = () -> {
            for (int i = 0; i < 1_000; ++i) {
                longWrapper.incrementValueNotSyncronized();
            }
        };

        Thread[] manyThreads = new Thread[1_000];
        for (int x = 0; x < manyThreads.length; x++) {
            manyThreads[x] = new Thread(r);
            manyThreads[x].start();
        }
        for (int x = 0; x < manyThreads.length; x++) {
            manyThreads[x].join();
        }

        System.out.println("Value:" + longWrapper.getL());
    }

    @Test
    public void testSyncronized() throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);
        Runnable r = () -> {
            for (int i = 0; i < 1_000; ++i) {
                longWrapper.incrementValueSyncronized();
            }
        };

        Thread[] manyThreads = new Thread[1_000];
        for (int x = 0; x < manyThreads.length; x++) {
            manyThreads[x] = new Thread(r);
            manyThreads[x].start();
        }
        for (int x = 0; x < manyThreads.length; x++) {
            manyThreads[x].join();
        }

        System.out.println("Value:" + longWrapper.getL());
    }
}
