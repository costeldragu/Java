package com.mdc.rxjava;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author : Costel DRAGU
 * @version $Id:$
 * @package : com.mdc.rxjava
 * @copyright Copyright (c) 2017
 * @date : 25.11.2017 17:02
 */
public class FirstClassCitizenVariableIlustration {

    public static void main(String[] args) {
        BiFunction<String, String, String> concatFunction = (s, t) -> s + t;
        System.out.println(concatFunction.apply("hello", "world"));

        concatFunction = FirstClassCitizenVariableIlustration::concatString;
        System.out.println(concatFunction.apply("hello1", "world1"));

        FirstClassCitizenVariableIlustration instance = new FirstClassCitizenVariableIlustration();
        concatFunction = instance::insConcatString;
        System.out.println(concatFunction.apply("hello2", "world2"));

        System.out.println(contactAndTransform("Heelo", "Wold", s ->  s.toUpperCase()));

        Function<String, String> trasnform  = s->  s.toUpperCase();

        System.out.println(contactAndTransform("Heelo", "Wold",trasnform));

        Supplier<String> xFomOperation =createCobineAndTransform("heloo","world",trasnform);
        System.out.printf(xFomOperation.get());
    }

    public static String concatString(String s, String t) {
        return s + t;
    }

    public String insConcatString(String s, String t) {
        return s + t;
    }


    public static String contactAndTransform(String s, String t, Function<String, String> transform) {
        if (transform != null) {
            s = transform.apply(s);
            t = transform.apply(t);
        }
        return s + t;
    }

    public static Supplier<String> createCobineAndTransform(final String s,final String t, final Function<String, String> transform) {
        return () -> {
           String ss = s;
           String tt = t;
            if (transform != null) {
                ss = transform.apply(s);
                tt = transform.apply(t);
            }
            return ss + tt;
        };
    }

}
