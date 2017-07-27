package com.mdc.DesignPattern.Creartional.Singleton.Eager;

public class SingleTon {
    private static SingleTon ourInstance = new SingleTon();

    public static SingleTon getInstance() {
        return ourInstance;
    }

    private SingleTon() {
    }
}
