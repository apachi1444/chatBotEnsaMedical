package com.n4mbot.master.register;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class RegisterApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(RegisterApplication.class.getResource("register.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 920, 720);
            stage.setTitle("N4MBot-Register");
            stage.setScene(scene);
            stage.setWidth(920);
            stage.setHeight(720);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
