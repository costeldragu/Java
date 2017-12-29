package com.mdc.games.bricks.gameobjects;

import javafx.geometry.Point2D;
import javafx.scene.Node;

/**
 * @author : Costel DRAGU
 * @version $Id:$
 * @package : com.mdc.games.bricks.gameobjects
 * @copyright Copyright (c) 2017
 * @date : 29.12.2017 16:52
 */
public abstract class GameObject {
    protected Node view;
    protected int speed = 4;
    protected int directionX = 1;
    protected int directionY = -1;
    protected Point2D velocity = new Point2D(speed * directionX, speed * directionY);


    public void setDirectionX(int directionX) {
        this.directionX = directionX;
    }

    public void setDirectionY(int directionY) {
        this.directionY = directionY;
    }

    public Node getView() {
        return view;
    }

    public Point2D getVelocity() {
        return velocity;
    }

    public void setView(Node view) {
        this.view = view;
    }

    public void setVelocity(Point2D velocity) {
        this.velocity = velocity;
    }
    public void updateVelocity() {
        setVelocity(new Point2D(speed * directionX, speed * directionY));
    }
}
