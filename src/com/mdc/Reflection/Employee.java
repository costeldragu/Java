package com.mdc.Reflection;

/**
 * Created by cdragu on 15.06.2017.
 */
public class Employee {


    Employee(){}

    public String getName() {
        return "My Name is";
    }

    public String getClassName() {
        return this.getClass().getName();
    }
}
