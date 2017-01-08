package com.mdc.Collections.Catalouge;

import com.mdc.Collections.Product;

/**
 * Created by CaDyMaN on 08.01.2017.
 */
public class ProductCatalougeTest
{
    public static void main(String[] args) {
        Supplier bobs = new Supplier("Bob's H");
        Supplier kates = new Supplier("Kate's Home");

        Product door = new Product("Wooden Door",35);
        Product floorPanel = new Product("Floor Panel",25);



        ProductCatalouge catalouge = new ProductCatalouge();
        catalouge.isSuppliedBy(bobs);
        catalouge.isSuppliedBy(kates);
    }

}
