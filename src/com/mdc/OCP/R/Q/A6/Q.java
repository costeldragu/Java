package com.mdc.OCP.R.Q.A6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q {
    public static void main(String[] args) {
        // write your code here

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2014,6,20);
        LocalDate d3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
