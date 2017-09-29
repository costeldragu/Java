package com.mdc.OCP.Tests.T7;

import com.mdc.Internationalization.NumberFromatFrame;

public class App {
    String myStr = "7007";
    public void doStuff(String str) {
        int myNum = 0;
        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        }catch (NumberFormatException e) {

        }
        System.out.println(myStr + " " + myNum);
    }

    public static void main(String[] a) {
        new App().doStuff("9009");
    }
}
