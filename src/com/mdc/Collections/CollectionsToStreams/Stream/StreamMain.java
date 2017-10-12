package com.mdc.Collections.CollectionsToStreams.Stream;

import com.mdc.Collections.CollectionsToStreams.Person;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", "Alice", 23);
        Person p2 = new Person("Brian", "Brian", 56);
        Person p3 = new Person("Chelsea", "Chelsea", 46);
        Person p4 = new Person("David", "David", 28);
        Person p5 = new Person("Erica", "ERica", 37);
        Person p6 = new Person("Francisco", "Francisco", 18);
        List<Person> people = Arrays.asList(p1, p2, p3, p4, p5, p6);

        Stream<Person> prsStream = people.stream();

        List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4, 4);
        Stream<Integer> stream = ints.stream();
        stream.forEach(System.out::println);

        Stream<Integer> secondStream = Stream.of(0,2,3,4,5);
        secondStream.forEach(System.out::println);

        Stream<String> streamOfString = Stream.generate(()->"one");
        streamOfString.limit(5).forEach(System.out::println);

        Stream<String> streamOfString2 = Stream.iterate("+",s->s+"+");
        streamOfString2.limit(5).forEach(System.out::println);

        IntStream streamOfInt = ThreadLocalRandom.current().ints();
        streamOfInt.limit(5).forEach(System.out::println);







    }
}
