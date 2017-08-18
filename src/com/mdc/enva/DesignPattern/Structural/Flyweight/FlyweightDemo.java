package com.mdc.enva.DesignPattern.Structural.Flyweight;

/**
 * Reuse the object and don't use much memory
 */
public class FlyweightDemo {

    public static void main(String[] args) {
        // write your code here
//        Integer firstInt = Integer.valueOf(5);
//        Integer secondInt = Integer.valueOf(5);
//        Integer thridInt = Integer.valueOf(10);
//
//        System.out.println(System.identityHashCode(firstInt));
//        System.out.println(System.identityHashCode(secondInt));
//        System.out.println(System.identityHashCode(thridInt));

        InventorySystem ims = new InventorySystem();
        ims.takeOrder("Roomba",1);
        ims.takeOrder("Samsung TV",2);
        ims.takeOrder("Roomba",3);
        ims.takeOrder("Bose Headphones",4);
        ims.takeOrder("Samsung TV",6);
        ims.process();

        System.out.println(ims.report());
    }
}
