package com.mdc.enva.Collection.Set.HashSet;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProductCatalouge implements Iterable<Product> {
    private final Set<Product> products = new HashSet<>();

    public void isSuppliedBy(Supplier supplier) {
       products.addAll(supplier.products());
    }


    @NotNull
    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
