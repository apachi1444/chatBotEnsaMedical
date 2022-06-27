package com.ensabot.main.parameter;

import com.ensabot.dao.DataBaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ParameterController {


    @FXML
    private Button closeButton;


    DataBaseConnection connectnow = new DataBaseConnection();

    public void closeHomeOnAcion(ActionEvent e) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }


}
