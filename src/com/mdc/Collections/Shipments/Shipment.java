package com.mdc.Collections.Shipments;

import com.mdc.Collections.Product;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by CaDyMaN on 07.01.2017.
 */
public class Shipment implements Iterable<Product> {
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    public static final int PRODUCT_NOT_PRESENT = -1;
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void prepare() {
        // Sort our lit of products by weight

        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {

                if (p1.getWeight() < p2.getWeight()) {
                    return -1;
                }

                if (p1.getWeight() > p2.getWeight()) {
                    return 1;
                }


                return 0;
            }
        });

        // find the product index that need the heavy van

        // assign view of the product list for heavy anf light vans
    }

    public void replace(Product oldProduct, Product newProduct) {
        final int index = products.indexOf(oldProduct);
        if (index != PRODUCT_NOT_PRESENT) {
            products.set(index, newProduct);
        }

    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }


}
