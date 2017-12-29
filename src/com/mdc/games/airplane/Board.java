package com.mdc.airplane;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

/**
 * Created by CaDyMaN on 30.01.2017.
 */
public class Board extends Pane {
    private int colums = 10;
    private int rows = 10;
    public final static int BRICK_SPACE = 2;
    private Image squareBg = new Image(getClass().getResource("assets/images/square.png").toExternalForm());


    Board() {
        createBoard();
    }

    Board(int colums, int rows) {
        this.colums = colums;
        this.rows = rows;
        createBoard();

    }

    Board(int colums, int rows, int brickSpace) {
        this.colums = colums;
        this.rows = rows;
        createBoard();
    }

    private void createBoard() {
        for (int row = 0; row < rows; ++row) {
            for (int column = 0; column < colums; ++column) {
                Rectangle square = createSquare((int) (row * Main.SQUARE_WIDTH)+(row*BRICK_SPACE), (column * Main.SQUARE_HEIGHT)+(column*BRICK_SPACE));
                getChildren().add(square);
            }
        }
    }

    /**
     * @param x
     * @param y
     * @return
     */
    private Rectangle createSquare(int x, int y) {
        Rectangle square = new Rectangle();
        square.setX(x);
        square.setY(y);
        square.setWidth(Main.SQUARE_WIDTH);
        square.setHeight(Main.SQUARE_HEIGHT);
        square.setFill(new ImagePattern(squareBg));
        square.setOnMouseDragEntered(e -> System.out.println("Target: drag entered"));
        square.setOnMouseDragOver(e -> System.out.println("Target: drag over"));
        square.setOnMouseDragReleased(e -> System.out.println("Target: drag released"));
        square.setOnMouseDragExited(e -> System.out.println("Target: drag exited"));
        return square;
    }
}
