package com.mdc.enva.DesignPattern.Behavioral.Memento;

import javax.sound.midi.Soundbank;
import java.net.Socket;

/**
 * Save the object state in order to do a roolback if  need it
 */
public class MementoDemo {


    public static void main(String[] args) {
        // write your code here
        Caretaker caretaker = new Caretaker();
        Employee e1 = new Employee("Dragu1", "addresa", "1236");
        Employee e2 = new Employee("Dragu2", "addresa", "1236");
        Employee e3 = new Employee("Dragu3", "addresa", "1236");
        Employee e4 = new Employee("Dragu4", "addresa", "1236");
        Employee e5 = new Employee("Dragu5", "addresa", "1236");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);

        caretaker.save(e1);
        caretaker.save(e2);
        caretaker.save(e3);
        caretaker.save(e4);
        caretaker.save(e5);

        e1.setAddress("ff");
        e2.setAddress("ffrrr");
        caretaker.revert(e1);
        caretaker.revert(e3);
        caretaker.revert(e2);
        caretaker.revert(e5);
        caretaker.revert(e4);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);

    }
}
