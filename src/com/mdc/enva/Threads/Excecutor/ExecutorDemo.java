package com.mdc.enva.Threads.Excecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) {
        ExecutorService executorService = null;
        // write your code here


        try {
            System.out.println("start");
            executorService = Executors.newSingleThreadExecutor();
            executorService.execute(() -> System.out.println("test"));
            executorService.execute(() -> System.out.println("test"));
            executorService.execute(() -> System.out.println("test"));
            executorService.execute(() -> {
                long i = 0;
                for (;i< 10000000000L;++i) { }
                System.out.println("Last Thread " + i);
            });
            System.out.println("End");
        } finally {
            executorService.shutdown();
        }


    }
}
