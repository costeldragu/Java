package com.mdc.codingame.HorseRacingDuals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResultTest {

    @Test
    public void simpleTest() {
        int horses = 3;
        int[] power = {5,8,9};
       Result r = new Result(horses , power);

        assertEquals(1,r.getResults());

    }

    @Test
    public void advanceTest() {
        int horses = 5;
        int[] power = {15,17,3,8,11,28,6,55,7};
        Result r = new Result(horses , power);

        assertEquals(1,r.getResults());
    }

   @Test
    public void AllHorseTie() {
        int horses = 5;
        int[] power = {1,4,3,2,5};
        Result r = new Result(horses , power);

        assertEquals(1,r.getResults());
    }
}
