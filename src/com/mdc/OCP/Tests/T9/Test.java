package com.mdc.OCP.Tests.T9;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] a) {
        List<String> names = new ArrayList<>();
       names.add("Robb");
       names.add("Bran");
       names.add("Rick");
       names.add("Bran");
       if(names.remove("Bran")) {
           names.remove("Jon");
       }

        System.out.println(names);
    }
}
