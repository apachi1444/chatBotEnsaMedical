package com.n4mbot.master.home;

import com.n4mbot.master.chats.alexa.AlexaApplication;
import com.n4mbot.master.chats.glover.GloverApplication;
import com.n4mbot.master.chats.siri.SiriApplication;
import com.n4mbot.master.parameter.ParameterApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;

public class HomeController {

    @FXML
    private Button alexa;

    @FXML
    private Button alexaHome;

    @FXML
    private Button closeButton;

    @FXML
    private Button glover;

    @FXML
    private Button gloverHome;

    @FXML
    private Button siri;

    @FXML
    private Button siriHome;


    public void closeHomeOnAcion(ActionEvent e){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    public void showAlexa(ActionEvent event) {
        showButtonOnAction(alexa, AlexaApplication.class.getResource("alexa.fxml"));
    }

    public void showAlexaHome(ActionEvent event) {
        showButtonOnAction(alexaHome, AlexaApplication.class.getResource("alexa.fxml"));
    }

    public void showSiri(ActionEvent event) {
        showButtonOnAction(siri, SiriApplication.class.getResource("siri.fxml"));
    }

    @FXML
    void showSiriHome(ActionEvent event) {
        showButtonOnAction(siriHome, SiriApplication.class.getResource("siri.fxml"));

    }

    @FXML
    void showGlover(ActionEvent event) {
        showButtonOnAction(glover, GloverApplication.class.getResource("glover.fxml"));

    }

    @FXML
    void showGloverHome(ActionEvent event) {
        showButtonOnAction(gloverHome, GloverApplication.class.getResource("glover.fxml"));
    }

    @FXML
    void showSettingHome(ActionEvent event) {
        showOnAction(ParameterApplication.class.getResource("parameter.fxml"));
    }


        private void showButtonOnAction(Button button, URL url){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(url);
                Scene scene = new Scene(fxmlLoader.load());
                Stage primaryStage = new Stage();
                primaryStage.setTitle("N4MBot");
                primaryStage.initStyle(StageStyle.UNDECORATED);
                primaryStage.setScene(scene);
                primaryStage.show();
                Stage stage = (Stage) button.getScene().getWindow();
                stage.close();
            } catch (Exception ed) {
                ed.printStackTrace();
            }
        }
        private void showOnAction(URL url){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(url);
                Scene scene = new Scene(fxmlLoader.load());
                Stage primaryStage = new Stage();
                primaryStage.setTitle("N4MBot");
                primaryStage.initStyle(StageStyle.UNDECORATED);
                primaryStage.setScene(scene);
                primaryStage.show();
            } catch (Exception ed) {
                ed.printStackTrace();
            }
        }
}

