package com.mdc.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by CaDyMaN on 07.01.2017.
 */
public class CollectionConcepts {

    public static void main(String[] args) {
        Product door = new Product("Wooden Door",35);
        Product floorPanel = new Product("Floor Panel",25);
        Product window = new Product("Glass window",25);
        Product smallWindow = new Product("Small Glass window",15);

        Collection<Product> products = new ArrayList<>();

        products.add(door);
        products.add(floorPanel);
        products.add(window);
        products.add(smallWindow);

        System.out.println(products);

        //With this we can remove element form collection
        final Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            if(product.getWeight() > 20) {
                System.out.println(product);
            }else{
                productIterator.remove();
            }

        }

//        for(Product product : products) {
//            System.out.println(product);
//        }

        System.out.println(products);
        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(smallWindow));
        System.out.println(products.contains(window));

        Collection<Product> otherProducts = new ArrayList<>();
        otherProducts.add(window);
        otherProducts.add(door);

        products.removeAll(otherProducts);
        System.out.println(products);
    }
}
