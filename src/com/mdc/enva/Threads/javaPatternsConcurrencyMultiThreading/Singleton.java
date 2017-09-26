package com.mdc.enva.Threads.javaPatternsConcurrencyMultiThreading;

public class Singleton {
    private static volatile Singleton instance;
    public static int intancesNumbers;
    private Object key = new Object();

    private Singleton() {
    }

    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            ++intancesNumbers;
            System.out.println("instance created");
        }

        return instance;
    }
}
