package com.mdc.DoIt;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class UiController implements Initializable {

    @FXML
    private ProgressBar progressBar;

    @FXML
    private TableView<?> taskTable;

    @FXML
    private TableColumn<?, ?> tasksTable;

    @FXML
    private ComboBox<String> priorities;

    @FXML
    private TextField taskDescription;

    @FXML
    private Button add;

    @FXML
    private Button cancel;

    @FXML
    private Spinner<Integer> progressSpinner;

    @FXML
    private CheckBox completeCheckBox;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        priorities.getItems().addAll("High", "Medium", "Low");
        progressSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));
        progressSpinner.valueProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == 100) {
                completeCheckBox.setSelected(true);
            } else {
                completeCheckBox.setSelected(false);
            }

            progressBar.setProgress(1.0 * newValue / 100);
        });
    }
}
