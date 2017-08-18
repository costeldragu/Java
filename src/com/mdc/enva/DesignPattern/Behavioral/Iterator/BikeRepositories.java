package com.mdc.enva.DesignPattern.Behavioral.Iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BikeRepositories implements Iterable<String> {

    private String[] bikes;
    private int index;

    BikeRepositories() {
        bikes = new String[10];
        index = 0;

    }

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Not implemented");
            }
        };
    }


    public BikeRepositories addBike(String type) {
        if (index == bikes.length) {
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
            largerBikes = null;
        }
        bikes[index] = type;
        ++index;

        return this;
    }
}
