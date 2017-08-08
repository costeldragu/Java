package com.mdc.OCP.R.Q.A11;

public class Q {
    public static void main(String[] args) {
        // write your code here
        int row = 10;
        for ( ; row  > 0 ; ) {
            int col = row;
            while (col >= 0) {
                System.out.print( col + " ");
                col -= 2;
            }
         row = row / col;
        }
    }
}
