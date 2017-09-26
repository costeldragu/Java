package com.mdc.enva.Threads.javaPatternsConcurrencyMultiThreading;

public class T1 implements Runnable {
    @Override
    public void run() {
        Singleton s = Singleton.getInstance();
    }
}
