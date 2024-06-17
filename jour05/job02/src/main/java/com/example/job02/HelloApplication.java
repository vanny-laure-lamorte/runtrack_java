package com.example.job02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import  javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage){
        BorderPane root = new BorderPane();

        // Button Quit
        Button quitButton = new Button("Quitter");

        // Event to quit
        quitButton.setOnAction(event -> primaryStage.close());

        // Position Quit at the bottom
        HBox bottomBox = new HBox(quitButton);
        bottomBox.setAlignment(javafx.geometry.Pos.CENTER);
        root.setBottom(bottomBox);

        // Creation scene
        Scene scene = new Scene(root, 400, 400);

        // Set scene and display the window
        primaryStage.setScene(scene);
        primaryStage.setTitle("Job02");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}