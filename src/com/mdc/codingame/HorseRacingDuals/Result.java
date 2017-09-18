package com.mdc.codingame.HorseRacingDuals;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Result {
    private int horses;
    private int[] power;
    private Integer oldB=0;

    Result(int horses, int[] power) {
        this.horses = horses;
        this.power = power;

    }

    public int getResults() {
        Integer result = 0;
        Set<Integer> tree = new TreeSet<>();
        for (int x = 0; x < power.length; ++x) {
            tree.add(power[x]);
        }

        Iterator iterator = tree.iterator();
        while (iterator.hasNext()) {
            Integer a = (Integer) iterator.next();
            Integer b;
            if (iterator.hasNext()) {
                b = (Integer) iterator.next();
            } else {
                b = a;
                a = oldB;
            }
            Integer difference = b - a;
            if (result == 0 || difference < result) {
                result = difference;
            }
            oldB = b;
        }
        return result;
    }
}
