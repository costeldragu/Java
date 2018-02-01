package com.mdc.games.bricks;

import com.mdc.games.bricks.gameobjects.Ball;
import com.mdc.games.bricks.gameobjects.GameObject;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author : Costel DRAGU
 * @version $Id:$
 * @package : com.mdc.games.bricks
 * @copyright Copyright (c) 2017
 * @date : 29.12.2017 16:51
 */
public class BricksApp extends Application {

    private Pane root;
    private static final int BALLS_COUNT = 300;

    Ball[] balls = new Ball[BALLS_COUNT];

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = new Pane();
        root.setPrefSize(1280, 800);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Brick");
        primaryStage.show();

        //Add Balls
        for (int x = 0; x < BALLS_COUNT; ++x) {
            balls[x] = new Ball(9);
           balls[x].setStartAt(x*3);



            addGameObject(balls[x], (root.getPrefWidth() / 2) - 7, root.getPrefHeight() - 14);
           // addGameObject(balls[x], Math.random() * scene.getWidth(), Math.random() * scene.getHeight());
        }

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                onUpdate();
            }
        };
        timer.start();

    }

    private void onUpdate() {
        for (Ball ball: balls) {
            ball.move(root);
        }
    }


    private void addGameObject(GameObject object, double x, double y) {
        object.getView().setTranslateX(x);
        object.getView().setTranslateY(y);
        root.getChildren().add(object.getView());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
