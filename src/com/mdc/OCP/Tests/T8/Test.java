package com.mdc.OCP.Tests.T8;

import java.time.LocalDate;

public class Test {
    public static void main(String[] a) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2017,9,29);

        System.out.println("date1 " + date1);
        System.out.println("date2 " + date2);
    }
}
