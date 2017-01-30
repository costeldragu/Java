package com.mdc.Airplane;

import com.mdc.Airplane.Board;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by CaDyMaN on 29.01.2017.
 */
public class Main extends Application {

    public final static int SQUARE_WIDTH = 30;
    public final static int SQUARE_HEIGHT = 30;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        primaryStage.setTitle("Planes");
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.getScene().getStylesheets().add(getClass().getResource("assets/css/style.css").toExternalForm());
        root.getStyleClass().add("root");

        root.getChildren().add(new Board());
        root.getChildren().add(new Plane());


    }

    public static void main(String[] args) {
        launch(args);
    }
}

