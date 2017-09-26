package com.mdc.enva.Threads.javaPatternsConcurrencyMultiThreading;

public class DeadLock {
    private Object key1 = new Object();
    private Object key2 = new Object();

    public void a() {
        synchronized (key1) {
            System.out.println("[ " + Thread.currentThread().getName() + " ] I am in a() ");
            a();

        }
    }

    public void b() {
        synchronized (key2) {
            System.out.println("[ " + Thread.currentThread().getName() + " ] I am in b() ");
            b();

        }
    }

    public void c() {
        synchronized (key1) {
            System.out.println("[ " + Thread.currentThread().getName() + " ] I am in c() ");
        }
    }


}
