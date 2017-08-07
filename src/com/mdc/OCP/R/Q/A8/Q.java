package com.mdc.OCP.R.Q.A8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q {
    public static void main(String[] args) {
        // write your code here
        String date = LocalDate
                .parse("2014-05-04")
                .format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(date);

    }
}
