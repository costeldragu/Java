package com.mdc.Aircraft;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

/**
 * Created by CaDyMaN on 21.01.2017.
 */
public class Board extends Pane {

    private Integer columns = 16;
    private Integer rows = 16;
    private double marginLeft = 15;
    private double marginTop = 142;

    Board() {
        createBoard();
    }

    Board(int columns, int rows, double marginLeft, double marginTop) {
        this.rows = rows;
        this.columns = columns;
        this.marginLeft = marginLeft;
        this.marginTop = marginTop;
        createBoard();
    }


    private void createBoard() {
        Pane topLeft = new Pane();
        Pane bottomRight = new Pane();

        setLayoutX(marginLeft);
        setLayoutY(marginTop);

        //Set inner board margin
        Integer borderMarginLeft = 26;
        Integer borderMarginTop = 24;

        //Calculate the board width
        double columnsWidth = borderMarginLeft + (columns * Main.SQUARE_WIDTH);
        double rowsHeight = borderMarginTop + (rows * Main.SQUARE_HEIGHT);
        double boardColumnsWidth = (columns * Main.SQUARE_WIDTH) + 10;
        double boardRowsHeight = (rows * Main.SQUARE_HEIGHT);

        //Set sizes
        setPrefSize(columnsWidth, rowsHeight);

        topLeft.setPrefSize(boardColumnsWidth, boardRowsHeight);
        topLeft.setLayoutX(borderMarginLeft);
        topLeft.setLayoutY(borderMarginTop);

        bottomRight.setPrefSize(boardColumnsWidth, boardRowsHeight);
        bottomRight.setLayoutX(borderMarginLeft);
        bottomRight.setLayoutY(borderMarginTop);

        //Add styles
        getStyleClass().add("board");
        topLeft.getStyleClass().add("board-top-left");
        bottomRight.getStyleClass().add("board-bottom-left");

        //Add Children
        getChildren().add(topLeft);
        getChildren().add(bottomRight);


        for (Integer num = 0; num < columns-1; ++num) {
            Label label;

            if(num > 8) {
                System.out.println(num);
                label = new Label(""+(num+1));
            }else{
                label = new Label(""+(num+1));
            }
            label.setLayoutX(12+borderMarginLeft+(num*Main.SQUARE_WIDTH));
            label.setLayoutY(0);
            label.setPrefSize(Main.SQUARE_WIDTH+20, Main.SQUARE_HEIGHT);
            label.getStyleClass().add("board-label");
            getChildren().add(label);
        }

    }
}
