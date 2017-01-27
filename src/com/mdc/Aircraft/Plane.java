package com.mdc.Aircraft;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.TranslateTransition;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
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
import java.util.Observable;

/**
 * Created by CaDyMaN on 21.01.2017.
 */
public class Plane extends Pane {
    private Plane instance;
    private DragContext drag;
    private int orientation = 1;
    private Pane rotate;
    private List<PlaneRectangle> sqares = new ArrayList<>();
    private double space = (Main.SQUARE_WIDTH / 2);
    private boolean canDrag = false;

    Plane() {
        instance = this;
        drawRotationAction();
        attachEvents();
        createSqareArray();
        drawPlane();

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
        final FadeTransition fade;

        rotate = new Pane();

        rotate.setPrefSize(20, 20);
        rotate.getStyleClass().add("rotate");

        rotate.setOnMouseClicked(e -> {
            if (orientation < 4) {
                ++orientation;
            } else {
                orientation = 1;
            }
            drawPlane();
        });

        getChildren().add(rotate);
        fade = new FadeTransition(Duration.millis(1), rotate);
        fade.setFromValue(1);
        fade.setToValue(0);
        fade.play();

    }

    private void attachEvents() {
        final FadeTransition fade;
        fade = new FadeTransition(Duration.millis(500), rotate);
        setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (canDrag) {
                    drag.mouseAnchorX = event.getX();
                    drag.mouseAnchorY = event.getY();
                    for (Node item : instance.getChildren()) {
                        setClass(item, "square_grid_plane_move");
                    }
                }
            }
        });

        setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (canDrag) {
                    double dragX = event.getSceneX();
                    double dragY = event.getSceneY();
                    //calculate new position of the circle
                    double newXPosition = drag.initialTranslateX + dragX - drag.mouseAnchorX;
                    double newYPosition = drag.initialTranslateY + dragY - drag.mouseAnchorY;
                    instance.setLayoutX(newXPosition);
                    instance.setLayoutY(newYPosition);

                    //Calculate the write position
                    int column = (int) Math.round(newXPosition / Main.SQUARE_WIDTH) ;
                    int row = (int) Math.round(newYPosition / Main.SQUARE_HEIGHT)  ;

                    System.out.println(column + " - " + row);

                    Rectangle r = (Rectangle) Main.mainBoardGrid.get(row).get(column);


                   //r.getStyleClass().add("square_grid_over");
                }

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

        setOnMouseEntered(e-> {
            fade.stop();
            fade.setFromValue(0);
            fade.setToValue(1);
            fade.play();
        });

        setOnMouseExited(e-> {
            fade.stop();
            fade.setFromValue(1);
            fade.setToValue(0);
            fade.play();
        });



    }

    private PlaneRectangle createSquare(int x, int y) {
        PlaneRectangle square = new PlaneRectangle();
        square.setX(x);
        square.setY(y);
        square.setWidth(Main.SQUARE_WIDTH);
        square.setHeight(Main.SQUARE_HEIGHT);
        square.getStyleClass().add("square_grid_plane");

        square.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                canDrag = true;
            }
        });
        square.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                canDrag = false;
            }
        });
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
                moveX = Main.SQUARE_WIDTH * 2;
                moveY = 0;
            }
            if (x > 0 && x < 6) {
                moveX = Main.SQUARE_WIDTH * (x - 1);
                moveY = Main.SQUARE_HEIGHT;
            }
            if (x == 6) {

                moveX = Main.SQUARE_WIDTH * 2;
                moveY = Main.SQUARE_HEIGHT * 2;
            }

            if (x > 6) {
                moveY = Main.SQUARE_HEIGHT * 3;
                moveX = Main.SQUARE_WIDTH * (x - 6);
            }
            doTransition((PlaneRectangle) sqares.get(x), moveX, moveY);
        }
    }

    private void drawHeadBottom() {
        for (int x = 0; x < 10; ++x) {
            double moveX = 0;
            double moveY = 0;
            if (x < 3) {
                moveX = Main.SQUARE_WIDTH * (x + 1);
                moveY = 0;
            }
            if (x == 3) {
                moveX = Main.SQUARE_WIDTH * 2;
                moveY = Main.SQUARE_HEIGHT;
            }

            if (x > 3 && x < 9) {
                moveX = Main.SQUARE_WIDTH * (x - 4);
                moveY = Main.SQUARE_HEIGHT * 2;
            }

            if (x == 9) {
                moveX = Main.SQUARE_WIDTH * 2;
                moveY = Main.SQUARE_HEIGHT * 3;
            }
            doTransition((PlaneRectangle) sqares.get(x), moveX, moveY);
        }
    }

    private void drawHeadLeft() {
        for (int x = 0; x < 10; ++x) {
            double moveX = 0;
            double moveY = 0;
            if (x == 0) {
                moveX = Main.SQUARE_WIDTH;
                moveY = 0;
            }
            if (x == 1) {
                moveX = Main.SQUARE_WIDTH;
                moveY = Main.SQUARE_HEIGHT;
            }
            if (x == 2) {
                moveX = Main.SQUARE_WIDTH * 3;
                moveY = Main.SQUARE_HEIGHT;
            }
            if (x > 2 && x < 7) {
                moveX = Main.SQUARE_WIDTH * (x - 3);
                moveY = Main.SQUARE_HEIGHT * 2;
            }
            if (x == 7) {
                moveX = Main.SQUARE_WIDTH;
                moveY = Main.SQUARE_HEIGHT * 3;
            }
            if (x == 8) {
                moveX = Main.SQUARE_WIDTH * 3;
                moveY = Main.SQUARE_HEIGHT * 3;
            }
            if (x == 9) {
                moveX = Main.SQUARE_WIDTH;
                moveY = Main.SQUARE_HEIGHT * 4;
            }
            doTransition((PlaneRectangle) sqares.get(x), moveX, moveY);
        }

    }

    private void drawHeadRight() {
        for (int x = 0; x < 10; ++x) {
            double moveX = 0;
            double moveY = 0;
            if (x == 0) {
                moveX = Main.SQUARE_WIDTH * 2;
                moveY = 0;
            }
            if (x == 1) {
                moveX = 0;
                moveY = Main.SQUARE_HEIGHT;
            }
            if (x == 2) {
                moveX = Main.SQUARE_WIDTH * 2;
                moveY = Main.SQUARE_HEIGHT;
            }
            if (x > 2 && x < 7) {
                moveX = Main.SQUARE_WIDTH * (x - 3);
                moveY = Main.SQUARE_HEIGHT * 2;
            }
            if (x == 7) {
                moveX = 0;
                moveY = Main.SQUARE_HEIGHT * 3;
            }
            if (x == 8) {
                moveX = Main.SQUARE_WIDTH * 2;
                moveY = Main.SQUARE_HEIGHT * 3;
            }
            if (x == 9) {
                moveX = Main.SQUARE_WIDTH * 2;
                moveY = Main.SQUARE_HEIGHT * 4;
            }
            doTransition((PlaneRectangle) sqares.get(x), moveX, moveY);
        }
    }


    private void doTransition(PlaneRectangle square, double moveX, double moveY) {
        square.toFront();
        double currentX = square.getMovedX();
        double currentY = square.getMovedY();
        TranslateTransition transition = new TranslateTransition(Duration.millis(500), square);
        transition.setFromX(currentX);
        transition.setFromY(currentY);
        transition.setToX(moveX);
        transition.setToY(moveY);
        transition.setInterpolator(Interpolator.EASE_BOTH);
        transition.play();
        square.setMovedX(moveX).setMovedY(moveY);
    }


}
