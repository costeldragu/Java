package com.mdc.OCP.R.Q.A71;

import java.time.LocalDate;
import java.time.Period;

public class Whizlabs {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 3, 26);
        Period p = Period.ofDays(1);
        System.out.println(date.plus(p));
    }
}
