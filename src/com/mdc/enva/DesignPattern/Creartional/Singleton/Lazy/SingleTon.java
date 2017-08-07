package com.mdc.enva.DesignPattern.Creartional.Singleton.Lazy;

/**
 *
 */
public class SingleTon {
    private static SingleTon ourInstance;

    public static SingleTon getInstance() {
        if(ourInstance == null)
            ourInstance = new SingleTon();
        return ourInstance;
    }

    private SingleTon() {
    }
}
