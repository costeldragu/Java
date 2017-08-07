package com.mdc.enva.T001;

public class Dog extends Mammalian {



    Dog() {
        setType("Dog");
        this.speak = "Bark";
    }


    Dog(String type) {
        setType(type);
        this.speak = "Bark";
    }

    Dog(String type, String speak) {
        setType(type);
        this.speak = speak;
    }

    @Override
    String getRealType() {
        return "Dog";
    }

    @Override
    public String speak() {
        return speak;
    }
}
