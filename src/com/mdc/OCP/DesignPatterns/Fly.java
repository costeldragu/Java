package com.mdc.OCP.DesignPatterns;

//import org.jetbrains.annotations.Contract;

/**
 * Created by cdragu on 02.02.2017.
 */
public interface Fly {
    public int getWingSpan() throws Exception;
    public static final int MAX_SPEED = 100;

    public default void land() {
        System.out.println("Animal is landing");
    }
   // @Contract(pure = true)
    public static double calculateSpeed(float distance, double time) {
        return distance/time;
    }
}
