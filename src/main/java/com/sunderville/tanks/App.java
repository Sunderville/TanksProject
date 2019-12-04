package com.sunderville.tanks;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.net.URL;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/fxml/MainWindow.fxml");
        loader.setLocation(xmlUrl);
        Parent root = loader.load();

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

//        primaryStage.setTitle("Tanks Calculator");
//        primaryStage.setWidth(800.0);
//        primaryStage.setHeight(600.0);
//        primaryStage.setResizable(false);
//
//        Label tanksCalculatorLabel = new Label("Tanks Calculator");
//        tanksCalculatorLabel.setAlignment(Pos.CENTER);
//        Scene primaryScene = new Scene(tanksCalculatorLabel);
//        primaryStage.setScene(primaryScene);
//
//        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}