package com.mdc.enva.Threads.javaPatternsConcurrencyMultiThreading;

/**
 * Testing race condition
 */
public class LongWrapper {
    private Object key = new Object();
    private  long l;

    public LongWrapper(long l) {
        this.l = l;
    }

    public long getL() {
        return l;
    }


    public void incrementValueNotSyncronized() {
        l = l + 1;
    }
    public void incrementValueSyncronized() {
        synchronized (key) {
            l = l + 1;
        }

    }
}
