package com.mdc.SOLID.SingleResponsiblityPrinciple;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {
    List<Shape> shapes = new ArrayList<>();
    SumCalculatorOutputter sumCalculatorOutputter = new SumCalculatorOutputter();

    public AreaCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    private long getSum() {
        return 0;
    };

    public SumCalculatorOutputter getSumCalculatorOutputter() {
        return sumCalculatorOutputter;
    }


}
