package com.mdc.Airplane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by CaDyMaN on 29.01.2017.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        primaryStage.setTitle("Planes");
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.getScene().getStylesheets().add(getClass().getResource("assets/css/style.css").toExternalForm());
        root.getStyleClass().add("root");


    }

    public static void main(String[] args) {
        launch(args);
    }
}

