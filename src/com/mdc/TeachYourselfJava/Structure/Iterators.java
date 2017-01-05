package com.mdc.TeachYourselfJava.Structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Created by CaDyMaN on 04.01.2017.
 */
public class Iterators {
    public static void main(String[] args) {
        List<String> BufferString = new ArrayList<>();
        BufferString.add("Ala bala");
        BufferString.add("Porto cala");
        BufferString.add("no cala");

        Iterator i = BufferString.iterator();

        for(String line : BufferString) {
            System.out.println(line);
        }
        while (i.hasNext()) {
            String line = (String) i.next();
            System.out.println(line);

        }
    }
}
