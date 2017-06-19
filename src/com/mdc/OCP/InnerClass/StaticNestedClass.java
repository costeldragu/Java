package com.mdc.OCP.InnerClass;

/**
 * Created by cdragu on 02.02.2017.
 * The nesting creates a namespace because the enclosing class name must be used to refer to it.
 * It can be made private or use one of the other access modifiers to encapsulate it.
 * The enclosing class can refer to the fields and methods of the static nested class.
 * You are allowed to access private instance variables,
 */
public class StaticNestedClass {

    static class Nested {
        private int price = 6;
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }

}
