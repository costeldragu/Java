package com.mdc.OCP.R.Q.A55;

public class String1 {
    public static void main(String[] args) {
        String s = "123";
        if (s.length() >2)
            s.concat("456");
        for(int x = 0; x <3; x++)
            s += "x";
        System.out.println(s);
    }
}
