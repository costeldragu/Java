package com.mdc.Test.T001;

public class MainTest {

    public static void main(String[] args) {

        PetShop shop = new PetShop();

        shop.addCat(new Cat("Siameze", "Mirlau"))
                .addCat(new Cat("Birtmaneze"))
                .addCat(new Cat("Tomberoneze"))
                .addDog(new Dog("Ciobanesc", "Ham ham"))
                .addDog(new Dog("Golanesc"))
                .addDog(new Dog("Tomberoneze"))
                .listCats()
                .listDogs();
        // write your code here

    }
}
