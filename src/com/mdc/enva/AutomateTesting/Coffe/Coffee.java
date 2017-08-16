package com.mdc.enva.AutomateTesting.Coffe;

public final class Coffee {
    private final CoffeeType type;


    private final int beabs;
    private final int milk;

    public Coffee(CoffeeType coffeeType, int beabs, int milk) {
        this.type = coffeeType;
        this.beabs = beabs;
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type=" + type +
                ", beabs=" + beabs +
                ", milk=" + milk +
                '}';
    }

    public CoffeeType getType() {
        return type;
    }

    public int getBeabs() {
        return beabs;
    }

    public int getMilk() {
        return milk;
    }

}
