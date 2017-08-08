package com.mdc.OCP.InstanceOf;

/**
 * Created by CaDyMaN on 01.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo;          // true
        boolean b2 = hippo instanceof HeavyAnimal;    // true
        boolean b3 = hippo instanceof Elephant;

        Hippo anotherHippo = new Hippo();
        //boolean b5 = anotherHippo instanceof Elephant; // DOES NOT COMPILE

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
