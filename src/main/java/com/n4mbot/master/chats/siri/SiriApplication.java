package com.n4mbot.master.chats.siri;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SiriApplication extends Application {
    @Override
    public void start(Stage stage){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SiriApplication.class.getResource("siri.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("N4MBOT-Siri");
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