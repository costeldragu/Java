package com.mdc.Collections.Catalouge;

import com.mdc.Collections.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CaDyMaN on 08.01.2017.
 */
public class Supplier {
    private String name;
    private List<Product> products = new ArrayList<>();

    Supplier(String name) {
        this.name = name;
    }

    List<Product> products() {
        return products;
    }
}
