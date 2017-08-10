package com.mdc.enva.Threads;

import java.util.Arrays;

public class RealHelloWorldSingleThreaded {
    public static void main(String[] args) {
        String countries[] = {"France", "India", "China", "USA"};
        for(String country : countries) {
            System.out.println("Hello " + country + "!");
        }

        //In Java8 We can use stream
        
//        Arrays.stream(countries).forEach( country -> System.out.println("Hello " + country + "!"));
        
    }


}
