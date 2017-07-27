package com.mdc.DesignPattern.Old.Singleton;

//Tread seve
public class SingleObject {

    //create an object of SingleObject
    private static SingleObject instance = null;

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstance(){
        if(instance == null) {
            //Thread save recommended
            synchronized (SingleObject.class) {
                if(instance == null) {
                    instance = new SingleObject();
                }
            }

        }


        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}