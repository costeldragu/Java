package com.mdc.enva.DesignPattern.Behavioral.Iterator;

import java.util.Iterator;

/**
 * Interate an object
 */
public class IteratorDemo {
    public static void main(String[] args) {
        // write your code here
        BikeRepositories repo = new BikeRepositories();
        repo.addBike("c");
        repo.addBike("d");
        repo.addBike("e");

        Iterator<String> iterator = repo.iterator();
        while(iterator.hasNext()) {
            System.out.printf(iterator.next());
        }



    }
}
