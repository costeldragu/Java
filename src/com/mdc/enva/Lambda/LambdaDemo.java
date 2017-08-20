package com.mdc.enva.Lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void main(String[] args) {
        // write your code here

        String x = "Costel";

       new Thread(() -> System.out.println(x)).start();
       new Thread(() -> System.out.println(x)).start();

    }
}
