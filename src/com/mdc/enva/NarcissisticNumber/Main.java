package com.mdc.enva.NarcissisticNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(" Please enter the input number :");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s.length() > 0) {
            Integer length = s.length();
            Double results = 0.0;
            for (int x = 0; x < s.length(); ++x) {
                Character n = s.charAt(x);
                System.out.println("x:" + x + " | results: " + results + " | length: " + length + " n:" + Integer.valueOf(n.toString()));
                results += Math.pow(Double.valueOf(n.toString()), (double) length.intValue());

            }
            if (results.equals(Double.valueOf(s))) {
                System.out.println("The number is Narcissistic");
                System.out.println("Results:" + results);
            } else {
                System.out.println("The number is not Narcissistic");
                System.out.println("Results:" + results);
            }
        }


    }
}
