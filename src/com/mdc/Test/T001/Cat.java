package com.mdc.Test.T001;

public class Cat extends Mammalian {
    /**
     * Default constructor
     */
    Cat() {
        setType("Cat");
        this.speak = "meow";
    }

    /**
     * Set type
     * @param type
     */
    Cat(String type) {
        setType(type);
        this.speak = "meow";
    }

    /**
     * Set type ans speak
     * @param type
     * @param speak
     */
    Cat(String type, String speak) {
        setType(type);
        this.speak = speak;
    }

    @Override
    public String getRealType() {
        return "Cat";
    }

    @Override
    public String speak() {
        return speak;
    }


}
