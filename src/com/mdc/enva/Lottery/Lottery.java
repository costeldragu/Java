package com.mdc.enva.Lottery;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        final Scanner reader = new Scanner(System.in);
        System.out.println("What is the highest number you can draw?");
        final int maxNumbers = reader.nextInt();

        System.out.println("What is the number o numbers that we can draw?");
        final int maxNumberExtraction = reader.nextInt();

        int[] numbers = new int[maxNumbers];

        for(int s=0;s < maxNumbers;++s)
            numbers[s]=s;

        boolean done = false;
        int extractCount =0;
        int[] extracted = new int[maxNumberExtraction];

        while (extractCount < maxNumberExtraction ) {

        }



        // write your code here

    }
}
