package com.mdc.games.bricks.gameobjects;

import javafx.geometry.Point2D;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * @author : Costel DRAGU
 * @version $Id:$
 * @package : com.mdc.games.bricks.gameobjects
 * @copyright Copyright (c) 2017
 * @date : 29.12.2017 16:57
 */
public class Ball extends GameObject {

    private long startAt = 0;
    private double radius;

    public Ball(double radius) {
        this.radius = radius;
        Circle circle = new Circle(radius);
        circle.setManaged(false);
        circle.setFill(Color.RED);
        circle.setEffect(new DropShadow(5, Color.BLACK));
        this.view = circle;
    }

    public void move(Pane container) {
        if (startAt == 0) {
            Double currentX = view.getTranslateX() + velocity.getX();
            Double currentY = view.getTranslateY() + velocity.getY();


            if (currentX > container.getPrefWidth() - radius * 2) {
                directionX = -1;
                this.setVelocity(new Point2D(speed * directionX, speed * directionY));
            }
            if (currentX < radius * 2) {
                directionX = 1;
                this.setVelocity(new Point2D(speed * directionX, speed * directionY));
            }

            if (currentY < radius * 2) {
                directionY = 1;
                this.setVelocity(new Point2D(speed * directionX, speed * directionY));
            }
            if (currentY > container.getPrefHeight() - radius * 2) {
                directionY = -1;
                this.setVelocity(new Point2D(speed * directionX, speed * directionY));
            }

            view.setTranslateX(currentX);
            view.setTranslateY(currentY);
        } else {
            --startAt;
        }


    }

    public void setStartAt(long startAt) {
        this.startAt = startAt;
    }
}
