package com.mdc.OCP.R.Q.A107;

public class MarkList {
    public static int count = 0;
    int num;
    MarkList() {
        ++count;
    }
    public static void graceMarks(MarkList obj4) {
        obj4.num += 10;
    }
    public static void main(String[] args) {
        MarkList obj1 = new MarkList();
        MarkList obj2 = obj1;
        MarkList obj3 = null;
        obj2.num = 60;
        graceMarks(obj2);
        System.out.println(count);
    }
}
