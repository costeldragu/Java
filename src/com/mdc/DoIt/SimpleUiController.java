package com.mdc.DoIt;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;

public class SimpleUiController {
    @FXML
    public TextField myText;

    public void initialize() {
        myText.setText("test");
    }
}
