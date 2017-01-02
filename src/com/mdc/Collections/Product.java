package com.mdc.Collections;

/**
 * Created by cdragu on 02.11.2016.
 */
public class Product {
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
        return "Product {" +
                "name='" + this.getName() + "'" +
                ", wight=" + this.getWeight() +
                "}";
    }
}
