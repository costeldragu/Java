package com.mdc.Airplane;

import com.mdc.Aircraft.*;
import javafx.animation.FadeTransition;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 * Created by CaDyMaN on 30.01.2017.
 */
public class Plane extends Pane {

    private Plane instance = this;
    private DragContext drag = new DragContext();

    Plane() {
        getStyleClass().add("plane");
        setPrefSize(Main.SQUARE_WIDTH * 5, Main.SQUARE_WIDTH * 4);
        attachEvents();
    }

    private void attachEvents() {
        setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                drag.mouseAnchorX = event.getX();
                drag.mouseAnchorY = event.getY();
            }
        });

        setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //if (canDrag) {
                double dragX = event.getSceneX();
                double dragY = event.getSceneY();
                //calculate new position of the circle
                double newXPosition = drag.initialTranslateX + dragX - drag.mouseAnchorX;
                double newYPosition = drag.initialTranslateY + dragY - drag.mouseAnchorY;
                instance.setLayoutX(newXPosition);
                instance.setLayoutY(newYPosition);

                //Calculate the write position
                int column = (int) Math.round(newXPosition / com.mdc.Aircraft.Main.SQUARE_WIDTH);
                int row = (int) Math.round(newYPosition / com.mdc.Aircraft.Main.SQUARE_HEIGHT);

                //  System.out.println(column + " - " + row);

                // Rectangle r = (Rectangle) com.mdc.Aircraft.Main.mainBoardGrid.get(row).get(column);


                //r.getStyleClass().add("square_grid_over");
            }

            //}
        });

        setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                //Calculate the write position
                double rightX = Math.round(instance.getLayoutX() / Main.SQUARE_WIDTH) * Main.SQUARE_WIDTH + Board.BRICK_SPACE;
                double rightY = Math.round(instance.getLayoutY() / Main.SQUARE_HEIGHT) * Main.SQUARE_HEIGHT + Board.BRICK_SPACE;
                instance.setLayoutX(rightX);
                instance.setLayoutY(rightY);


            }
        });


    }
}
