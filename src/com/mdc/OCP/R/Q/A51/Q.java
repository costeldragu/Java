package com.mdc.OCP.R.Q.A51;

public class Q {
    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();

        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b2.test();

    }
}
