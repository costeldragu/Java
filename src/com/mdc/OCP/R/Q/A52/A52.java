package com.mdc.OCP.R.Q.A52;

public class A52 {

    public static void main(String[] args) {
        String names[] = new String[3];
        names[0] = "Mary Brown";
        names[0] = "Nancy Red";
        names[0] = "Jessy Orange";

        try {
            for (String n : names) {
                String pwd = n.substring(0, 3) + n.substring(6, 10);
                System.out.println(pwd);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array out of limits");
        }
    }

}
