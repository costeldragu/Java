package com.mdc.OCP.R.Q.A59;

class X {
    public void mX() {
        System.out.println("Xm1");
    }
}

class Y extends X {
    public void mX() {
        System.out.println("Xm2");
    }

    public void mY() {
        System.out.println("Ym");
    }
}

public class Test {
    public static void main(String[] args) {
        // write your code here
        X xRef = new Y();
        Y yRef = (Y) xRef;
        yRef.mY();
        xRef.mX();
    }

}
