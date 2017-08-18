package com.mdc.enva.DesignPattern.Behavioral.Interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterDemo {
    public static void main(String[] args) {
        // write your code here
        String input = "Lion, and tigers, and bears! Oh, my!";
        Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger|Lion)");
        Matcher m = p.matcher(input);
        while (m.find()) {
            System.out.println("Found a " + m.group() + ".");
        }

    }

}
