package com.mdc.SOLID.SingleResponsiblityPrinciple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreaCalculatorTest {

    @Test
    public void test() {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Circle(6));
        shapes.add(new Square(5));
        AreaCalculator areaCalculator = new AreaCalculator(shapes);

        areaCalculator.getSumCalculatorOutputter().HTML();
    }

}
