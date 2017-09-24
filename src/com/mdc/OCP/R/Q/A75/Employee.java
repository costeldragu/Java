package com.mdc.OCP.R.Q.A75;

public class Employee {
    String name;
    boolean contract;
    double salary;

    Employee() {

    }

    @Override
    public String toString() {
        return name + ":" + contract + ":" + salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Joe";
        e.contract = true;
        e.salary = 100;
        System.out.println(e);
    }
}
