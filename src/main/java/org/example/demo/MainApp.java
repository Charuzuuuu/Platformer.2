package org.example.demo;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

public class MainApp extends Application{

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("level-ui.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();

    }

}