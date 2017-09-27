package com.mdc.OCP.R.Q.A93;

public class Q {
    static public void main(String... s) {
        String[][] arra = new String[3][];
        arra[0] = new String[]{"rose", "lily"};
        arra[1] = new String[]{"apple", "berry","cherry","grapes"};
        arra[0] = new String[]{"beans", "carrot","potato"};
        System.out.println(arra[1]);
        for (String a[]:arra){
            if(a != null) {
                for (String x : a){
                    x = x.toUpperCase();
                    System.out.println(x);
                }
            }

        }

        System.out.println(arra);
    }
}
