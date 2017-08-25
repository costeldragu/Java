package com.mdc.OCP.R.Q.A42;

import java.util.ArrayList;
import java.util.List;

public class A42 {

    public static void main(String[] args) {
        List<Alpha> strs = new ArrayList<>();
        strs.add(new Alpha());
        strs.add(new Beta());
        strs.add(new Gama());
        for(Alpha t : strs) {
            System.out.println(t.doStuff("Java"));
        }
    }
}
