package com.mdc.OCP.Tests.T2;

public class Camel {
    int weight = 2;
    String getGait() { return " mph, lope"; }
    void go(int speed) {
        ++speed; weight++;
        int walkrate = speed * weight;
        System.out.print(walkrate + getGait());
    }


}
