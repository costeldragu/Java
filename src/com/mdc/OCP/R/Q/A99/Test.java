package com.mdc.OCP.R.Q.A99;

public class Test {
    static void dispResult(int[] num) {
        try {
            System.out.println(num[1] / (num[1] - num[2]));
        } catch (ArithmeticException e) {
            System.err.println("First exception");
        }
        System.out.println("Done");
    }

    public static void main(String... args) {
        try {
            int[] arr = {100, 100};
            dispResult(arr);
        }catch (IllegalArgumentException e) {
            System.err.println("second exception");
        }catch (Exception e) {
            System.err.println("third exception");
        }
    }
}
