package com.mdc.CollectionsToStreams.FunctionalLandaTest;

import com.mdc.CollectionsToStreams.Person;

import java.util.function.Function;
import java.util.function.Supplier;

public class MainComparator {
    public static void main(String[] args) {



//        Supplier<Person> personConstruct = Person::new;
//
//        Person person1 = personConstruct.get().setFirstName("Dragu");
//        Person person2 = new Person("Dragu","Marinela",30);
//
//        Comparator<Person> cmpAge = (p1, p2) -> p1.getAge() - p1.getAge();
//        Comparator<Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
//        Comparator<Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
//
//        Function<Person, Integer> f1 = p -> p.getAge();
//        Function<Person, String> f2 = p -> p.getLastName();
//        Function<Person, String> f3 = p -> p.getLastName();
//
//        Comparator<Person> cmpPerson = Comparator.comparing(Person::getAge);
//        Comparator<Person> cmp = Comparator.comparing(Person::getFirstName).thenComparing(Person::getFirstName);
//
//        System.err.println(cmpPerson.compare(person1,person2));
    }
}
