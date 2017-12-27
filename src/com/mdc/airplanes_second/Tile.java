package com.mdc.airplanes_second;

import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 * @author : Costel DRAGU
 * @version $Id:$
 * @package : com.mdc.airplanes_second
 * @copyright Copyright (c) 2017
 * @date : 26.12.2017 14:27
 */
public class Tile extends StackPane {
    private int x;
    private int y;
    private int size;
    private Rectangle border;
    private Text text = new Text();

    public Tile(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
        border = new Rectangle(size, size);
        border.getStyleClass().add("math_square");
        setTranslateX(x * size);
        setTranslateY(y * size);
        getChildren().add(border);
    }


}
