package com.mdc.enva.Collection.List.ArrayList;

import java.util.Comparator;

public class Product {
    public static final Comparator<Product> BY_WEIGHT
            = (p1, p2) -> Integer.compare(p1.getWeight(), p2.getWeight());
    public static final Comparator<Product> BY_NAME
            = (p1, p2) ->  p1.getName().compareTo(p2.getName());
    private final String name;
    private final int weight;

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
