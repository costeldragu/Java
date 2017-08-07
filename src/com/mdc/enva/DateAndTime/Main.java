package com.mdc.enva.DateAndTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // write your code here

        LocalDate today = LocalDate.now();
        LocalDateTime todayWithTime = LocalDateTime.now();

        System.out.println(today);
        System.out.println(todayWithTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E yyyy-MM-dd HH:mm");

        System.out.println(formatter);

        Instant now = Instant.now();
        System.out.println(now);

        String s1 = "bunny";
        String s2 = "bunny";
        String s3 =  new String("bunny");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
    }
}
