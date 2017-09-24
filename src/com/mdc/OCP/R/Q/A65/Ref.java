package com.mdc.OCP.R.Q.A65;

import java.util.ArrayList;
import java.util.List;



public class Ref {
    public static void main(String[] args) {
        List objs = new ArrayList<>();
        Contract c1 = new Super();
        Contract c2 = new Sub();
        Super s1 = new Sub();

        objs.add(c1);
        objs.add(c2);
        objs.add(s1);
        for (Object itm:objs) {
            System.out.println(itm.getClass().getName());
        }
    }
}
