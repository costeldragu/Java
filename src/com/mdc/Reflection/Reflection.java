package com.mdc.Reflection;
import java.lang.ClassNotFoundException;
import java.lang.InstantiationException;
import java.lang.IllegalAccessException;
/**
 * Created by cdragu on 15.06.2017.
 */
public class Reflection {

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.getClassName());
        Class cl = e.getClass();
        System.out.println(cl.getName());
//        System.out.println(Class.forName(""));

        String Employee = "com.mdc.Reflection.Employee";
        try {
            Object em = Class.forName(Employee).newInstance();
           // System.out.println(em.getName());
        }catch (ClassNotFoundException err) {
            System.out.println("ClassNotFoundException");
        }catch (InstantiationException err) {
            System.out.println("InstantiationException");
        }catch (IllegalAccessException err) {
            System.out.println("IllegalAccessException");
        }catch (Exception err) {
            System.out.println("Exception");
        }


    }
}
