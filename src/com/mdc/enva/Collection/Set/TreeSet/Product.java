package com.mdc.enva.Collection.Set.TreeSet;

import java.util.Comparator;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (weight != product.weight) return false;
        //return name != null ? name.equals(product.name) : product.name == null;
        return Objects.equals(name,product.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + weight;
       // return result;
        return Objects.hash(name,weight);
    }
}
