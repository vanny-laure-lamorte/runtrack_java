package com.example.job02;

// I
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void QuitButtonClick() {
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.close();
    }
}