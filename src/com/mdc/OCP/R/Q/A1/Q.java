package com.mdc.OCP.R.Q.A1;

public class Q {
    static int count = 0;
    int i = 0;

    public void changeCount() {
        while (i < 5) {
            i++;
            count++;
        }
    }
    public static void main(String[] args) {
        // write your code here
        System.out.println("Start");
        Q test = new Q();
        Q test1 = new Q();
        test.changeCount();
        test1.changeCount();
        System.out.println(test.count + " : " + test1.count);

    }
}
