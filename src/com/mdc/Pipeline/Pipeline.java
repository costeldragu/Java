package com.mdc.Pipeline;

import java.util.*;
import java.util.stream.Stream;

public class Pipeline {
    public static void main(String[] args) {
        // write your code here
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for (String name: list) {
            if (name.length() == 4) filtered.add(name);
        }
        Collections.sort(filtered);
        Iterator<String> iterator = filtered.iterator();
        if (iterator.hasNext()) System.out.println(iterator.next());
        if (iterator.hasNext()) System.out.println(iterator.next());

        //Pipe line
        list.stream().filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);


        final Stream<Integer> stream = Stream.of(1,2,3);
        System.out.println(stream.reduce(0, (s, n) -> s + n));

    }
}
