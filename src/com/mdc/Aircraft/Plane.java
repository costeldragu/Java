package com.mdc.Aircraft;

import javafx.animation.PathTransition;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;

import javafx.scene.Node;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CaDyMaN on 21.01.2017.
 */
public class Plane extends Pane {
    private Plane instance;
    private DragContext drag;
    private int orientation = 3;
    private Label rotate;
    private List<PlaneRectangle> sqares = new ArrayList<>();
    private double space = (Main.SQUARE_WIDTH / 2);

    Plane() {
        instance = this;
        attachEvents();
        createSqareArray();
        drawPlane();
        drawRotationAction();
        setLayoutX(Main.MARGIN);
        setLayoutY(Main.MARGIN);
        drag = new DragContext();
        drag.initialTranslateX = Main.MARGIN;
        drag.initialTranslateY = Main.MARGIN;
        getStyleClass().add("board");
        setPrefSize(Main.SQUARE_WIDTH * 5, Main.SQUARE_HEIGHT * 5);

    }

    private void createSqareArray() {
        for (int x = 0; x < 10; ++x) {
            sqares.add(createSquare(0, 0));
        }
        getChildren().addAll(sqares);
    }


    private void drawPlane() {
        switch (orientation) {
            case 1:
                drawHeadTop();
                break;
            case 2:
                drawHeadLeft();
                break;
            case 3:
                drawHeadRight();
                break;
            case 4:
                drawHeadBottom();
                break;
        }
    }

    private void drawRotationAction() {
        rotate = new Label("R");
        rotate.setPrefSize(15, 15);
        rotate.getStyleClass().add("board");
        rotate.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (orientation < 4) {
                    ++orientation;
                } else {
                    orientation = 1;
                }
                drawPlane();
            }
        });

        getChildren().add(rotate);

    }

    private void attachEvents() {
        setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                drag.mouseAnchorX = event.getX();
                drag.mouseAnchorY = event.getY();
                for (Node item : instance.getChildren()) {
                    setClass(item, "square_grid_plane_move");
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
                //Calculate the write position
                double rightX = Math.round(instance.getLayoutX() / Main.SQUARE_WIDTH) * Main.SQUARE_WIDTH + Main.MARGIN;
                double rightY = Math.round(instance.getLayoutY() / Main.SQUARE_HEIGHT) * Main.SQUARE_HEIGHT + Main.MARGIN;
                instance.setLayoutX(rightX);
                instance.setLayoutY(rightY);
                for (Node item : instance.getChildren()) {
                    removeClass(item, "square_grid_plane_move");
                }
            }
        });

        setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {

            }
        });

        setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {

            }
        });
    }

    private PlaneRectangle createSquare(int x, int y) {
        PlaneRectangle square = new PlaneRectangle();
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

    private void drawHeadTop() {
        for (int x = 0; x < 10; ++x) {
            double moveX = 0;
            double moveY = 0;
            if (x == 0) {
                moveX = Main.SQUARE_WIDTH * 2 + space;
                moveY = space;
            }
            if (x > 0 && x < 6) {
                moveX = Main.SQUARE_WIDTH * (x - 1) + space;
                moveY = Main.SQUARE_HEIGHT + space;
            }
            if (x == 6) {
                moveX = Main.SQUARE_WIDTH * 2 + space;
                moveY = Main.SQUARE_HEIGHT * 2 + space;
            }
            if (x > 6) {
                moveY = Main.SQUARE_HEIGHT * 3 + space;
                moveX = Main.SQUARE_WIDTH * (x - 6) + space;
            }
            doTransition((PlaneRectangle) sqares.get(x), moveX, moveY);
        }
    }

    private void drawHeadBottom() {
        for (int x = 0; x < 10; ++x) {
            double moveX = 0;
            double moveY = 0;
            if (x < 3) {
                moveX = Main.SQUARE_WIDTH * (x + 1) + space;
                moveY = space;
            }
            if (x == 3) {
                moveX = Main.SQUARE_WIDTH * 2 + space;
                moveY = Main.SQUARE_HEIGHT + space;
            }

            if (x > 3 && x < 9) {
                moveX = Main.SQUARE_WIDTH * (x - 4) + space;
                moveY = Main.SQUARE_HEIGHT * 2 + space;
            }

            if (x == 9) {
                moveX = Main.SQUARE_WIDTH * 2 + space;
                moveY = Main.SQUARE_HEIGHT * 3 + space;
            }
            doTransition((PlaneRectangle) sqares.get(x), moveX, moveY);
        }
    }

    private void drawHeadLeft() {
        for (int x = 0; x < 10; ++x) {
            double moveX = 0;
            double moveY = 0;
            if (x == 0) {
                moveX = Main.SQUARE_WIDTH + space;
                moveY = space;
            }
            if (x == 1) {
                moveX = Main.SQUARE_WIDTH + space;
                moveY = Main.SQUARE_HEIGHT + space;
            }
            if (x == 2) {
                moveX = Main.SQUARE_WIDTH * 3 + space;
                moveY = Main.SQUARE_HEIGHT + space;
            }
            if (x > 2 && x < 7) {
                moveX = Main.SQUARE_WIDTH * (x - 3) + space;
                moveY = Main.SQUARE_HEIGHT * 2 + space;
            }
            if (x == 7) {
                moveX = Main.SQUARE_WIDTH + space;
                moveY = Main.SQUARE_HEIGHT * 3 + space;
            }
            if (x == 8) {
                moveX = Main.SQUARE_WIDTH * 3 + space;
                moveY = Main.SQUARE_HEIGHT * 3 + space;
            }
            if (x == 9) {
                moveX = Main.SQUARE_WIDTH + space;
                moveY = Main.SQUARE_HEIGHT * 4 + space;
            }
            doTransition((PlaneRectangle) sqares.get(x), moveX, moveY);
        }

    }

    private void drawHeadRight() {
        for (int x = 0; x < 10; ++x) {
            double moveX = 0;
            double moveY = 0;
            if (x == 0) {
                moveX = Main.SQUARE_WIDTH * 2 + space;
                moveY =  space;
            }
            if (x == 1) {
                moveX =  space;
                moveY = Main.SQUARE_HEIGHT + space;
            }
            if (x == 2) {
                moveX = Main.SQUARE_WIDTH * 2 + space;
                moveY = Main.SQUARE_HEIGHT + space;
            }
            if (x > 2 && x < 7) {
                moveX = Main.SQUARE_WIDTH * (x - 3) + space;
                moveY = Main.SQUARE_HEIGHT * 2 + space;
            }
            if (x == 7) {
                moveX = space;
                moveY = Main.SQUARE_HEIGHT * 3 + space;
            }
            if (x == 8) {
                moveX = Main.SQUARE_WIDTH * 2 + space;
                moveY = Main.SQUARE_HEIGHT * 3 + space;
            }
            if (x == 9) {
                moveX = Main.SQUARE_WIDTH * 2 + space;
                moveY = Main.SQUARE_HEIGHT * 4 + space;
            }
            doTransition((PlaneRectangle) sqares.get(x), moveX, moveY);
        }
    }


    private void doTransition(PlaneRectangle square, double moveX, double moveY) {
        double currentX = square.getMovedX();
        double currentY = square.getMovedY();
        Path path = new Path();
        path.getElements().add(new MoveTo(currentX, currentY));
        path.getElements().add(new LineTo(moveX, moveY));
        PathTransition transition = new PathTransition();
        transition.setNode(square);
        transition.setDuration(Duration.seconds(1));
        transition.setPath(path);
        transition.play();
        square.setMovedX(moveX).setMovedY(moveY);

    }


}
