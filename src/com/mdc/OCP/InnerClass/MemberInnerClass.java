package com.mdc.OCP.InnerClass;

/**
 * Created by cdragu on 02.02.2017.
 *
 * Can be declared public, private, or protected or use default access
 * Can extend any class and implement interfaces
 * Can be abstract or final
 * Cannot declare static fields or methods
 * Can access members of the outer class including private members
 */
public class MemberInnerClass {
    //The greeting is available in the inner class
    //because it is in the same class
    private String greeting = "Hi";

    protected class Inner {
        public int repeat = 3;

        public void go() {
            for (int i = 0; i < repeat; i++)
                System.out.println(greeting);
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        MemberInnerClass outer = new MemberInnerClass();
        outer.callInner();
        //other way to access the inner class
        Inner inner = outer.new Inner();
        inner.go();
    }
}