package com.mdc.Collections.CollectionsToStreams.Map;

import com.mdc.Collections.CollectionsToStreams.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainAPICollection {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", "Alice", 23);
        Person p2 = new Person("Brian", "Brian", 56);
        Person p3 = new Person("Chelsea", "Chelsea", 46);
        Person p4 = new Person("David", "David", 28);
        Person p5 = new Person("Erica", "ERica", 37);
        Person p6 = new Person("Francisco", "Francisco", 18);
        List<Person> people = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));
        /**
         * Foreach with lambada
         */
        people.forEach(person -> System.out.println(person));

        /*
         * Remove all the object of the age is lowe than 20 years
         */
        people.removeIf(person -> person.getAge() < 20);
        /**
         * Replace all object with new one
         */
        people.replaceAll(person -> new Person(person.getFirstName().toUpperCase(), person.getLastName().toUpperCase(), person.getAge()));
        /**
         * Sort using comparable
         */
        people.sort(Comparator.comparing(Person::getAge).reversed());

        people.forEach(System.out::println);
    }
}
