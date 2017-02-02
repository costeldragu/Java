package com.mdc.OCP;

/**
 * Created by CaDyMaN on 28.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book (101, "Java Programing");
        Book b2 = new Book (102, "Java Programing");
        System.out.println (b1.equals(b2)); //line n2
    }
}
