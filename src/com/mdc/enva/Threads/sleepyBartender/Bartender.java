package com.mdc.enva.Threads.sleepyBartender;

import java.util.concurrent.TimeUnit;

public class Bartender implements Runnable {
    @Override
    public void run() {
        System.out.println("Bartender: My boss isn't in today; Time for a quick snooze!");
        while (true) {
            if(Thread.interrupted()) {
                System.out.println("Bartender: Zzz er erm, is someone waiting");
            }
            try {
                TimeUnit.SECONDS.sleep(5);
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
