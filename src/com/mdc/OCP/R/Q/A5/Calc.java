package com.mdc.OCP.R.Q.A5;

public class Calc extends Mid {
    public static void main(String[] args) {
        int n1 = 22, n2 = 2;
// insert code here
        Calc c = new Calc();
        int n3 = c.findMid(n1,n2);
        System.out.print(n3);

        int n4 = c.findMid(n1,n2);
        System.out.print(n4);

    }
}
