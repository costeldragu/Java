package com.mdc.Collections;

import java.util.Arrays;

/**
 * Created by cdragu on 02.11.2016.
 */
public class TheArrayProblem {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door",35);
        Product floorPanel = new Product("Floor Panel",25);

        //Create
        Product[] products = { door, floorPanel};

        //Add
        final Product window = new Product("Window", 15);
        products = add(window,products);


        //Print
        System.out.println(Arrays.toString(products));


    }

    private static Product[] add(Product product, Product[] array) {
        int length = array.length;
        Product[] newArray = Arrays.copyOf(array, length+ 1);
        newArray[length] = product;
        return newArray;



    }
}
