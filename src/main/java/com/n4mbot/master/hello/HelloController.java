package com.n4mbot.master.hello;


import com.n4mbot.master.login.LoginApplication;
import com.n4mbot.master.register.RegisterApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.net.URL;

public class HelloController {
    @FXML
    private Button helloCommencer;
    @FXML
    private Button helloLogin;
    @FXML
    private Button closeButton;


    public void afficherLoginOnAction(ActionEvent e) {
        showPerButton(helloLogin, LoginApplication.class.getResource("login.fxml"));
    }

    public void afficherCommencerOnAction(ActionEvent e) {
        showPerButton(helloCommencer, RegisterApplication.class.getResource("register.fxml"));
    }

    private void showPerButton(Button button, URL url) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(url);
            Stage primaryStage = new Stage();
            Scene scene = new Scene(fxmlLoader.load());
            primaryStage.setTitle("4MNBot");
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.setScene(scene);
            primaryStage.show();
            Stage stage = (Stage) button.getScene().getWindow();
            stage.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void closeHomeOnAcion(ActionEvent e){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
