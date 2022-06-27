package com.n4mbot.master.parameter;

import com.n4mbot.dao.DataBaseConnection;
import com.n4mbot.master.home.HomeApplication;
import com.n4mbot.master.register.RegisterApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.sql.ResultSet;

public class ParameterController {


    @FXML
    private Button closeButton;


    DataBaseConnection connectnow = new DataBaseConnection();

    public void closeHomeOnAcion(ActionEvent e) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }


}
