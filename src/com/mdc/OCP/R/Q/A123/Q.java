package com.mdc.OCP.R.Q.A123;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Q {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(13);
        list.add(30);
        list.add(11);
        list.add(2);
        list.removeIf(integer -> integer % 2 == 0);
        System.out.println(list);
    }
}
