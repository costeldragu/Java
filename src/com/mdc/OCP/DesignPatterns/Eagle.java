package com.mdc.OCP.DesignPatterns;

/**
 * Created by cdragu on 02.02.2017.
 */
public class Eagle implements Fly {
    public int getWingSpan() {
        return 15;
    }
    @Override
    public void land() {
        System.out.println("Eagle is diving fast");
    }
}