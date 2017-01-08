package com.mdc.Collections.Catalouge;

import com.mdc.Collections.Product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by CaDyMaN on 08.01.2017.
 */
public class ProductCatalouge implements Iterable<Product> {

    private final Set<Product> products = new HashSet<>();

    public void isSuppliedBy(Supplier supplier) {
        products.addAll(supplier.products());

    }
    public Iterator<Product> iterator() {
        return null;
    }

}
