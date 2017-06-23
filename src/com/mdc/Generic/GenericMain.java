package com.mdc.Generic;

import java.util.logging.Logger;

/**
 * Created by cdragu on 23.06.2017.
 */
public class GenericMain {
    public static void main(String[] args) {
        // write your code here

        Pair<String> pair = new Pair<>();

        pair.setFirst("10");
        pair.setSecond("20");

        System.out.println(pair);

        Pair<Integer> iPair = new Pair<>();
        iPair.setFirst(1);
        iPair.setSecond(3);

        Logger.getGlobal().info(iPair.toString());


    }
}
