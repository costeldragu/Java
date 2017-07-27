package com.mdc.Test.T001;

import java.util.ArrayList;
import java.util.List;

public class PetShop {

    private List<Dog> dogs = new ArrayList<>();
    private List<Cat> cats = new ArrayList<>();

    PetShop() {

    }

    public PetShop addDog(Dog dog) {
        dogs.add(dog);
        return this;

    }

    public PetShop addCat(Cat cat) {
        cats.add(cat);
        return this;
    }

    public int getDogsCount() {
        return dogs.size();
    }

    public int getCatsCount() {
        return cats.size();
    }

    public Dog sellDog(int Index) throws ArrayIndexOutOfBoundsException {
        return dogs.get(Index);
    }

    public Cat sellCat(int Index) throws ArrayIndexOutOfBoundsException {
        return cats.get(Index);
    }

    public PetShop listDogs() {

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        return this;

    }

    public PetShop listCats() {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        return this;

    }
}
