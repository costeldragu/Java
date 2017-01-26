package com.mdc.Fx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;

/**
 * Created by CaDyMaN on 25.01.2017.
 */
public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Text msg = new Text("Hello JavaFX");
        VBox root = new VBox();
        // Create a button with "Exit" text
        Button exitBtn = new Button("Exit");

        root.getChildren().add(msg);
        Scene scene = new Scene(root, 300, 350);
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX Application with a Scene");
        stage.show();

        exitBtn.setOnAction(event -> Platform.exit());
        root.getChildren().add(exitBtn);
        Rectangle r = new Rectangle(75, 50, 50, 20);
        r.setEffect(new DropShadow());
        r.getTransforms().add(new Translate(100,100));
        root.getChildren().add(r);
    }
}
