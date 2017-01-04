package com.mdc.TeachYourselfJava.Threads;

/**
 * Created by CaDyMaN on 04.01.2017.
 */
public class Calculator implements Runnable {
    private int x;
    private int y;
    private String name;
    private int count = 0;

    Calculator(String name, int x, int y) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Calculator calculate() {
        x = x + y;
        y = y + x;
        return this;
    }

    public String toString() {
        return "Thread " + name + " x: " + x + " y:" + y;
    }

    /**
     * Loop infinite;
     */
    private void infineLoop() {
        while (count < 10000) {
            System.out.println(this.calculate().toString());
            ++count;
        }
    }

    @Override
    public void run() {
        this.infineLoop();
    }
}
