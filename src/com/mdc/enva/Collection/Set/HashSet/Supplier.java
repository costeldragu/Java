package com.mdc.enva.Collection.Set.HashSet;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private final String name;
    private final List<Product> products = new ArrayList<>();

    Supplier(String name) {
        this.name = name;
    }

    public List<Product> products() {
        return products;
    }


}
