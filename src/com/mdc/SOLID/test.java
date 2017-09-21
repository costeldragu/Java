package com.mdc.SOLID;

import org.junit.Test;

import java.util.function.Predicate;

public class test {
    @Test
    public void StringTest() {
        String line = new String("-");
        String secondLine = line.concat("-");
        String secondLine1 = line.concat("- -");
        System.out.println(line == secondLine);
        System.out.println(" ");
        System.out.println(line.length());
        System.out.println(secondLine1.length());
        System.out.println(secondLine);
        System.out.println(secondLine1);
    }

    @Test
    public void predicateTest() {
//        StringBuilder c = "-ef";
//        Predicate dash = c -> c.startsWith("‐");
//        System.out.println(dash.test(""));
    }
}
