package com.mdc.enva.Optional;

import java.util.Optional;

public class OptionalDemo {
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println(average(90, 100,95,52));
        System.out.println(average());

        Optional<Double> opt = average(90, 100);
        if (opt.isPresent())
            System.out.println(opt.get());

        opt.ifPresent(System.out::println);


    }

}
