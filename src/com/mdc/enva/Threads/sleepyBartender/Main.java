package com.mdc.enva.Threads.sleepyBartender;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Bartender bartender = new Bartender();
        Thread bartenderThread = new Thread(bartender, "Bartender");

        bartenderThread.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {

        }
        int numCustomers = 5;
        for (int i = 1; i <= numCustomers; i++) {
            String customerName = "Customer " + i;
            Customer customer = new Customer(bartenderThread,customerName,(long) (Math.random() * 10));
            new Thread(customer,customerName).start();
        }
    }


}
