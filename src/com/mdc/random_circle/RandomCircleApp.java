package com.mdc.random_circle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @author : Costel DRAGU
 * @version $Id:$
 * @package : com.mdc.random_circle
 * @copyright Copyright (c) 2017
 * @date : 27.12.2017 12:58
 */
public class RandomCircleApp extends Application {
    Color[] colors = {
            new Color(0.2, 0.5, 0.8, 1.0).saturate().brighter().brighter(),
            new Color(0.3, 0.2, 0.7, 1.0).saturate().brighter().brighter(),
            new Color(0.8, 0.3, 0.9, 1.0).saturate().brighter().brighter()
    };

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane rootPane = new StackPane();

        Pane container = new Pane();

        rootPane.getChildren().add(container);

        container.setStyle("-fx-background-color: rgb(25,41,80)");

        Scene scene = new Scene(rootPane, 1280, 800);

        int spanNodes = 800;
        for (int i = 0; i < spanNodes; i++) {
            spanNode(scene, container);
        }
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void spanNode(Scene scene, Pane container) {
        Circle node = new Circle(0);
        node.setManaged(false);
        node.setFill(colors[(int) (Math.random() * colors.length)]);

        node.setCenterX(Math.random() * scene.getWidth());
        node.setCenterY(Math.random() * scene.getHeight());
        container.getChildren().add(node);

        Timeline timeline = new Timeline(
                new KeyFrame(
                        Duration.ZERO,
                        new KeyValue(node.radiusProperty(), 0),
                        new KeyValue(node.centerXProperty(), node.getCenterX()),
                        new KeyValue(node.centerYProperty(), node.getCenterY()),
                        new KeyValue(node.opacityProperty(), 0)
                ),
                new KeyFrame(
                        Duration.seconds(5 + Math.random() * 5),
                        new KeyValue(node.opacityProperty(), Math.random()),
                        new KeyValue(node.radiusProperty(), Math.random() * 20)
                ),
                new KeyFrame(
                        Duration.seconds(10 + Math.random() * 20),
                        new KeyValue(node.radiusProperty(), 0),
                        new KeyValue(node.centerYProperty(), Math.random() * scene.getWidth()),
                        new KeyValue(node.centerYProperty(), Math.random() * scene.getHeight()),
                        new KeyValue(node.opacityProperty(), 0)
                )
        );

        timeline.setCycleCount(1);
        timeline.setOnFinished(evt -> {
            container.getChildren().remove(node);
            spanNode(scene, container);
        });
        timeline.play();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
