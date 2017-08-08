package com.mdc.OCP.R.Q.A4;

public class Q {

    // write your code here
    String name;
    int age = 25;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Q(String n) {
   //  this(); error here
     setName(n);
    }

    public Q(String n,int a) {
    //    Q(n); error here
        setAge(a);
    }


    public static void main(String[] args) {


    }
}
