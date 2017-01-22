package com.mdc.Aircraft;

import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 * Created by CaDyMaN on 21.01.2017.
 */
public class Board extends Group {

    Board() {

        Pane topLeft = new Pane();
        Pane bottomRight = new Pane();
        GridPane gp = new GridPane();

        topLeft.getStyleClass().add("board-top-left");
        bottomRight.getStyleClass().add("board-bottom-left");
        gp.getStyleClass().add("board-top-left");



        getChildren().add(topLeft);
        getChildren().add(bottomRight);
        getChildren().add(gp);
    }

}
