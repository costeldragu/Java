package com.mdc.Aircraft;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

import javafx.scene.Node;

/**
 * Created by CaDyMaN on 21.01.2017.
 */
public class Plane extends Group {
    private Plane instance;
    private DragContext drag;

    Plane() {
        instance = this;
        createPlane();
        setLayoutX(Main.MARGIN);
        setLayoutY(Main.MARGIN);
        drag = new DragContext();
        drag.initialTranslateX = Main.MARGIN;
        drag.initialTranslateY = Main.MARGIN;
    }

    private void createPlane() {
        getChildren().add(createSquare(Main.SQUARE_WIDTH * 2, 0));
        for (int x = 0; x < 5; ++x) {
            getChildren().add(createSquare(Main.SQUARE_WIDTH * x, Main.SQUARE_HEIGHT));
        }
        getChildren().add(createSquare(Main.SQUARE_WIDTH * 2, Main.SQUARE_HEIGHT * 2));
        for (int x = 1; x < 4; ++x) {
            getChildren().add(createSquare(Main.SQUARE_WIDTH * x, Main.SQUARE_HEIGHT * 3));
        }

        setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                drag.mouseAnchorX = event.getX();
                drag.mouseAnchorY = event.getY();
                for( Node item : instance.getChildren() ) {
                    setClass(item,"square_grid_plane_move");
                }
            }
        });

        setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double dragX = event.getSceneX();
                double dragY = event.getSceneY();
                //calculate new position of the circle
                double newXPosition = drag.initialTranslateX + dragX - drag.mouseAnchorX;
                double newYPosition = drag.initialTranslateY + dragY - drag.mouseAnchorY;
                instance.setLayoutX(newXPosition);
                instance.setLayoutY(newYPosition);
            }
        });

        setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                for( Node item : instance.getChildren() ) {
                    removeClass(item,"square_grid_plane_move");
                }
            }
        });
    }

    private Rectangle createSquare(int x, int y) {
        Rectangle square = new Rectangle();
        square.setX(x);
        square.setY(y);
        square.setWidth(Main.SQUARE_WIDTH);
        square.setHeight(Main.SQUARE_HEIGHT);
        square.getStyleClass().add("square_grid_plane");
        return square;
    }

    private void setClass(Node square, String className) {
        square.getStyleClass().add(className);
    }

    private void removeClass(Node square, String className) {
        int index = square.getStyleClass().indexOf(className);
        if (index > 0) {
            square.getStyleClass().remove(index);
        }
    }

}
