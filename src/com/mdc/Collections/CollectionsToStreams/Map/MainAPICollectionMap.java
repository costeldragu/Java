package com.mdc.Collections.CollectionsToStreams.Map;

import com.mdc.Collections.CollectionsToStreams.City;
import com.mdc.Collections.CollectionsToStreams.Person;

import java.util.*;

public class MainAPICollectionMap {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", "Alice", 23);
        Person p2 = new Person("Brian", "Brian", 56);
        Person p3 = new Person("Chelsea", "Chelsea", 46);
        Person p4 = new Person("David", "David", 28);
        Person p5 = new Person("Erica", "ERica", 37);
        Person p6 = new Person("Francisco", "Francisco", 18);

        City newYork = new City("New York");
        City shanghai = new City("Shanghai");
        City paris = new City("Paris");


        Map<City, List<Person>> map = new HashMap<>();
        /**
         * Use put if absent in order to create the paris list if is not already there
         */
        map.putIfAbsent(paris, new ArrayList<>());
        map.get(paris).add(p1);

        /**
         * Use compute if absent to create the entry and add new people
         */
        map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p2);
        map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p3);


        /**
         * return default values instead of null
         */
        System.out.println("People from Paris " + map.getOrDefault(paris, Collections.emptyList()));
        System.out.println("People from New York " + map.getOrDefault(newYork, Collections.emptyList()));


        Map<City, List<Person>> map1 = new HashMap<>();
        map1.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p1);
        map1.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p2);
        map1.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p3);
        System.out.println("Map 1");
        map1.forEach(((city, people) -> {
            System.out.println(city + ":" + people);
        }));

        Map<City, List<Person>> map2 = new HashMap<>();
        map2.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p4);
        map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p5);
        map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p6);

        System.out.println("Map 2");
        map2.forEach(((city, people) -> {
            System.out.println(city + ":" + people);
        }));
        /**
         * Merge the map1 to map2
         */
        map2.forEach(((city, people) -> {
            //If the city is not in map1 them the it will be added and the BiConsumer will not be executed
            map1.merge(city, people,
                    //If the city exist wee need to add all form list A to list N
                    (peopleFromMap1, peopleFromMap2) -> {
                        peopleFromMap1.addAll(peopleFromMap2);
                        return peopleFromMap1;
                    });
        }));

        System.out.println("Map 1 merged");
        map1.forEach(((city, people) -> {
            System.out.println(city + ":" + people);
        }));
    }
}
