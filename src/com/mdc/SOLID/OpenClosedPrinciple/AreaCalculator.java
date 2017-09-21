package com.mdc.SOLID.OpenClosedPrinciple;

import com.mdc.SOLID.SingleResponsiblityPrinciple.Shape;
import com.mdc.SOLID.SingleResponsiblityPrinciple.SumCalculatorOutputter;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {
    List<Shape> shapes = new ArrayList<>();
    SumCalculatorOutputter sumCalculatorOutputter = new SumCalculatorOutputter();

    public AreaCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    private double getSum() {
        double total = 0;
        for (Shape shape : shapes
                ) {
            total += shape.getArea();
        }

        return total;
    }

    ;

    public SumCalculatorOutputter getSumCalculatorOutputter() {
        return sumCalculatorOutputter;
    }


}
