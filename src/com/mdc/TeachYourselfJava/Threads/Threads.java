package com.mdc.TeachYourselfJava.Threads;

/**
 * Created by CaDyMaN on 04.01.2017.
 */
public class Threads {

    public static void main(String[] args) {
        Calculator c1 = new Calculator("C1",1,1);
        Calculator c2 = new Calculator("C2",3,1);

        Thread r1 = new Thread(c1);
        Thread r2 = new Thread(c2);

        r1.start();
        r2.start();

    }
}
