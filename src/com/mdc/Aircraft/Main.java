package com.mdc.Aircraft;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.event.EventHandler;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class Main extends Application {

    public final static int SQUARE_WIDTH = 25;
    public final static int SQUARE_HEIGHT = 25;
    final static int MARGIN = 5;
    private final static int BOARD_ROW = 24;
    private final static int BOARD_COLUMN = 36;
    private List PlayerBoard = new ArrayList<>();
    private List ClientBoard = new ArrayList<>();


    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();
        Group group = new Group();
        Font.loadFont(
                getClass().getResource("assets/fonts/seabattle.ttf").toExternalForm(),
                10
        );

        primaryStage.setTitle("Planes");
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.getScene().getStylesheets().add(getClass().getResource("assets/css/style.css").toExternalForm());

        createBackgroundBoard(root, 5, 5);
        root.getChildren().add(new Plane());
        root.getChildren().add(new Plane());
        root.getChildren().add(new Plane());

        Label testControl = new Label("| 1234567890 ___ TRON");
        root.getChildren().add(testControl);
//
//
//
//
//
//        root.getChildren().add(new Plane());
//        root.getChildren().add(new Plane());


    }

    /**
     * @param x
     * @param y
     * @return
     */
    private Rectangle createBackroundSquare(int x, int y) {

        Rectangle square = new Rectangle();
        square.setX(x);
        square.setY(y);
        square.setWidth(SQUARE_WIDTH);
        square.setHeight(SQUARE_HEIGHT);
        square.getStyleClass().add("math_square");
        return square;

    }

    /**
     * Create the board
     *
     * @param root
     * @param x
     * @param y
     */
    private void createBackgroundBoard(Pane root, int x, int y) {
        for (int row = 0; row < BOARD_ROW; ++row) {
            for (int column = 0; column < BOARD_COLUMN; ++column) {
                Rectangle square = createBackroundSquare((int) (column * SQUARE_WIDTH) + x, (row * SQUARE_HEIGHT) + y);
                root.getChildren().add(square);
            }
        }
    }

    private void setClass(Rectangle square, String className) {
        square.getStyleClass().add(className);
    }

    private void removeClass(Rectangle square, String className) {
        int index = square.getStyleClass().indexOf(className);
        if (index > 0) {
            square.getStyleClass().remove(index);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
