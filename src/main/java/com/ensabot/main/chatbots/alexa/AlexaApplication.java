package com.ensabot.main.chatbots.alexa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class AlexaApplication extends Application {
    @Override
    public void start(Stage stage){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(AlexaApplication.class.getResource("alexa.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("N4MBOT-Alexa");
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
        }catch (Exception x){
            x.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch();
    }
}