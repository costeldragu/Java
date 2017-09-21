package com.mdc.SOLID.InterfaceSegregationPrinciple;

public class Cuboid implements ShapeInterface,SolidShapeInterface {
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
