package com.mdc.OCP.R.Q.A12;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);
        Patient p = new Patient("Mike");
        ps.add(p);
        int f = ps.indexOf(p);
        if(f >=0) {
            System.out.println("Mike Found");
        }else
            System.out.println("Mike not Found");
        // write yor code here

    }
}
