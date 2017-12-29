package com.mdc.airplanes_second;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author : Costel DRAGU
 * @version $Id:$
 * @package : com.mdc.games.airplanes_second
 * @copyright Copyright (c) 2017
 * @date : 26.12.2017 14:21
 */
public class AirplaneApp extends Application {

    private static final int TILE_SIZE = 40;
    private static final int SCENE_WIDTH = 1200;
    private static final int SCENE_HEIGHT = 600;
    private static final int X_TILES = SCENE_WIDTH / TILE_SIZE;
    private static final int Y_TILES = SCENE_HEIGHT / TILE_SIZE;

    private Tile[][] grid = new Tile[X_TILES][Y_TILES];

    private Pane root;


    private Parent createContent() {
        root = new Pane();
        root.setPrefSize(SCENE_WIDTH, SCENE_HEIGHT);

        for(int y = 0 ; y < Y_TILES; y++) {
            for(int x = 0; x < X_TILES; x++) {
                Tile tile = new Tile(x,y,TILE_SIZE);
                grid[x][y] = tile;
                root.getChildren().add(tile);
            }
        }

        System.out.println(grid.length);
//        AnimationTimer timer = new AnimationTimer() {
//            @Override
//            public void handle(long now) {
//                onUpdate();
//            }
//        };
//        timer.start();
        return root;
    }

    private void onUpdate() {

    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(createContent()));
        stage.getScene().getStylesheets().add(getClass().getResource("assets/css/style.css").toExternalForm());

        stage.show();
        stage.setTitle("Air plane");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
