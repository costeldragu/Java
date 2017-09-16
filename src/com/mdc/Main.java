package com.mdc;

public class Main {

    static class test {

    }

    int x = 5;
    static int y = 7;

    public static void main(String[] args) {
        // write your code here
        new Main();
    }

    Main() {
        test t = new test();

        System.out.println("Constructor");
        m(1260000000, 2, 5);

    }

    static {
        System.out.println("second initalizator");
    }


    static {
        System.out.println(y);
        System.out.println("static");
    }


    {
        System.out.println("non statick");
    }


    public int m(int i, int y) {
        System.out.println("int");
        return i;
    }

    public long m(long i, long y) {
        System.out.println("Long");
        return i;
    }

    public Integer m(Integer i, Integer y) {
        System.out.println("Integer");
        return i;
    }

    public Integer m(Integer... i) {
        System.out.println("varargs");
        return 0;
    }




}
