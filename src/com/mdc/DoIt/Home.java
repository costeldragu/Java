package com.mdc.DoIt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Home extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            GridPane grid = FXMLLoader.load(getClass().getResource("fxml/ui.fxml"));

            Scene scene = new Scene(grid, 300, 300);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Do IT !!!");
            primaryStage.show();
        }catch (Exception e) {
            e.printStackTrace();
        }


    }
}
