package com.mdc.enva.T003;

public class Bear implements Herbivore, Omnivore {
    public static void main(String[] args) {
        // write your code here
       Bear bear = new Bear();
       bear.eatMeat();
       bear.eatPlants();
        System.out.println( bear.getPI());
    }

    @Override
    public void eatMeat() {
        System.out.println("Eating meat");
    }

    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
