package com.mdc.enva.T001;

import java.util.ArrayList;
import java.util.List;

public class PetShop {

    private List<Animal> dogs = new ArrayList<>();
    private List<Animal> cats = new ArrayList<>();

    PetShop() {

    }

    public PetShop addDog(Animal dog) {
        dogs.add(dog);
        return this;

    }

    public PetShop addCat(Animal cat) {
        cats.add(cat);
        return this;
    }

    public int getDogsCount() {
        return dogs.size();
    }

    public int getCatsCount() {
        return cats.size();
    }

    public Animal sellDog(int Index) throws ArrayIndexOutOfBoundsException {
        return dogs.get(Index);
    }

    public Animal sellCat(int Index) throws ArrayIndexOutOfBoundsException {
        return cats.get(Index);
    }

    public PetShop listDogs() {

        for (Animal dog : dogs) {
            System.out.println(dog);
        }

        return this;

    }

    public PetShop listCats() {
        for (Animal cat : cats) {
            System.out.println(cat);
        }
        return this;

    }
}
