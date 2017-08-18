package com.mdc.enva.DesignPattern.Behavioral.Interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Most uset for grammar interpreter
 */
public class InterpreterDemo {

    static Expression buildInterpreterTree() {
        Expression t1 = new TerminalExpression("Lions");
        Expression t2 = new TerminalExpression("Tigers");
        Expression t3 = new TerminalExpression("Bears");

        Expression a1 = new AndExpression(t2,t3);

        Expression a2 = new OrExpression(t1,a1);

        return new AndExpression(t3,a2);
    }

    public static void main(String[] args) {
        // write your code here
        String input = "Lion, and tigers, and bears! Oh, my!";
        Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger|Lion)");
        Matcher m = p.matcher(input);
        while (m.find()) {
            System.out.println("Found a " + m.group() + ".");
        }

      //  String context = "Lions";
      //  String context = "Trigers";
      //  String context = "Lions Bears";
         String context = "Tigers Bears";
        Expression define = buildInterpreterTree();
        System.out.printf(context + " is " + define.interpret(context));

    }

}
