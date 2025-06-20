package com.example.flowershop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Простая сцена с надписью
        Label label = new Label("Магазин цветов");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 400, 300);

        // Настройка основного окна
        primaryStage.setTitle("Магазин цветов");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}