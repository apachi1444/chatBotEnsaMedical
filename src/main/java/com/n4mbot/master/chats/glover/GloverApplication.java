package com.n4mbot.master.chats.glover;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class GloverApplication extends Application {
    @Override
    public void start(Stage stage){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(GloverApplication.class.getResource("glover.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("N4MBOT-Glover");
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