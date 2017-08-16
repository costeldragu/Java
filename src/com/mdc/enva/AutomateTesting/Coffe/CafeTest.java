package com.mdc.enva.AutomateTesting.Coffe;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CafeTest {
    // can brew espresso
    @Test
    public void canBrewEspresso() {
        //Given - clause
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        //When clause
        Coffee coffee = cafe.brew(CoffeeType.Espresso);


        // Then - clause
        // it is an espresso
        assertEquals("Coffe not good",CoffeeType.Espresso, coffee.getType());
        //no milk
        assertEquals(0, coffee.getMilk());
        //that we've got enough coffee
        assertEquals(7, coffee.getBeabs());
    }

    /**
     *
     */
    @Test
    public void brewingExpressoConsumesBeans() {
        //Given - clause
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        //When clause
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        // Then - clause
        assertEquals(0, cafe.getBeansInStock());
    }

    /**
     *
     */
    @Test(expected = IllegalStateException.class)
    public void checkBeansStock() {
        //Given - clause
        Cafe cafe = new Cafe();
        //When clause
        Coffee coffee = cafe.brew(CoffeeType.Espresso);
    }

    @Test(expected = IllegalStateException.class)
    public void latteRequiresMilk() {
        //Given - clause
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        //When clause
        Coffee coffee = cafe.brew(CoffeeType.Latte);
    }

}
