package com.mdc.OCP.Tests.T15;

public class FieldIInit {
    char c;
    boolean b;
    float f;

    public static void main(String[] args) {
        new FieldIInit().printAll();
    }

    void printAll() {
        System.out.println("c="+c);
        System.out.println("b="+b);
        System.out.println("b="+f);
    }
}
