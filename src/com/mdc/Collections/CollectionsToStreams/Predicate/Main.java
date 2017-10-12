package com.mdc.Collections.CollectionsToStreams.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() > 5;
        Predicate<String> p3 = p1.and(p2);
        System.out.println("P3 for Yes: " + p3.test("Yes"));
        System.out.println("P3 for Good morning: " + p3.test("Good morning"));
        System.out.println("P3 for Good morning gentlemen: " + p3.test("Good morning gentlemen"));

        Predicate<String> p4 = p1.or(p2);

        System.out.println("P4 for Yes: " + p4.test("Yes"));
        System.out.println("P4 for Good morning: " + p4.test("Good morning"));
        System.out.println("P4 for Good morning gentlemen: " + p4.test("Good morning gentlemen"));

        Predicate<String> p5 = Predicate.isEqualaTo("yes");
        System.out.println("P5 for yes: " + p5.test("yes"));
        System.out.println("P5 for nu: " + p5.test("no"));

    }
}
