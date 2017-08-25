package com.mdc.OCP.R.Q.A50;

public class A50 {
    public static String doMsg(int i) {
        return "doMsg int";
    }

    public static String doMsg(char i) {
        return "doMsg char";
    }

    public static void main(String[] args) {
        char x = '8';
        int y = 8;
        System.out.println(doMsg(y));
        System.out.println(doMsg(x));
    }
}
