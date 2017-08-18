package com.mdc.enva.DesignPattern.Creartional.Singleton.ThreadSafe;

public class SingleTon {
    private static SingleTon ourInstance;

    public static SingleTon getInstance() {
        if(ourInstance == null) {
            synchronized (SingleTon.class) {
                if(ourInstance == null)
                    ourInstance = new SingleTon();

            }
        }
        return ourInstance;
    }

    private SingleTon() {
    }
}
