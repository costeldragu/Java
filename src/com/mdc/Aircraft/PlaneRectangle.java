package com.mdc.Aircraft;

import javafx.scene.shape.Rectangle;

/**
 * Created by CaDyMaN on 24.01.2017.
 * WE need to add supplementary parameters
 */
public class PlaneRectangle extends Rectangle {
    private double movedY;
    private double movedX;

    public PlaneRectangle setMovedY(double movedY) {
        this.movedY = movedY;
        return this;
    }

    public PlaneRectangle setMovedX(double movedX) {
        this.movedX = movedX;
        return this;
    }

    public double getMovedY() {
        return movedY;
    }

    public double getMovedX() {
        return movedX;
    }
}
