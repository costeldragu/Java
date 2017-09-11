package com.mdc.OCP.Tests.T3;

import org.junit.Test;

import java.util.*;
import java.sql.*;
import java.util.Date;

public class T3 {

    public T3() {
    }


    //    @Test
//    public void test() {
//        System.out.println(a);
//    }
    @Test
    public void test2() throws CloneNotSupportedException {
        BogdanDate date = new BogdanDate("Date1");
        System.out.println(date);
        MyString theString = date.getDate();
        theString.setString("DateWas1");
        System.out.println(date);
        System.out.println(theString);
    }

    @Test
    public void test3() {
//        TipA b = new b().getInnerClass();
//        b.getFromC();
    }

    @Test
    public void test4() {
        int flavors = 25;
        int eaten = 0;
        switch (flavors) {
            case 25:
                eaten++;
            case 30:
                eaten++;
            case 40:
                eaten += 2;
            default:
                eaten--;
        }
        System.out.print(eaten);
    }

    @Test
    public void test5() {
        String[] data = {};
        if (data.length >= 1 && (data[0].equals("sound") || data[0].equals("logic")) && data.length < 2) {
            System.out.print(data[0]);
        }
    }

    @Test
    public void test6() {
        String[] os = new String[] { "Mac", "Linux", "Windows" };
        Arrays.sort(os);
        System.out.println(Arrays.binarySearch(os, "RedHat"));
    }
}


class Employee {
    private String firstname;
    private String lastname;
    private int age;

    //empty Constructor
    public Employee() {
    }

    public Employee(String firstname) {
        this.firstname = firstname;
    }

    public Employee(String firstname, String lastname) {
        this(firstname);
        this.lastname = lastname;
    }

    public Employee(String firstname, int age) {
        this(firstname);
        this.age = age;
    }

}

class MyString implements Cloneable {
    private String string;

    public MyString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "MyString{" +
                "string='" + string + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class BogdanDate {
    private MyString date = new MyString("TextIs");

    BogdanDate() {
    }

    BogdanDate(String date) {
//        this.date =
    }

    public MyString getDate() throws CloneNotSupportedException {
        return (MyString) date.clone();
    }

    @Override
    public String toString() {
        return "BogdanDate{" +
                "date='" + date + '\'' +
                '}';
    }
}


interface TipA {
    void getFromC();
}

class b {
    TipA getInnerClass() {
        class c implements TipA {
            c() {
                System.out.println("from ce");
            }

            public void getFromC() {
                System.out.println("getFromC");
            }
        }
        return new c();
    }
}

