package com.n4mbot.master.login;

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

public class LoginController {

    @FXML
    private Button incrireButton;

    @FXML
    private Label messageLabel;

    @FXML
    private PasswordField password;

    @FXML
    private Button quitterButton;

    @FXML
    private Button seConnecterButton;

    @FXML
    private TextField userName;


    DataBaseConnection connectnow = new DataBaseConnection();

    @FXML
    public void quitterOnAction(ActionEvent e) {
        Stage stage = (Stage) quitterButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void seConnecterOnAction(ActionEvent e) {
         if (e.getSource() == seConnecterButton )  {
             boolean txtF = userName.getText().isBlank();
             boolean pswF = password.getText().isBlank();
             if (txtF == false && pswF ==  false) {
                 validateLogin();
             } else {
                 messageLabel.setText("Nom d'utilisateur ou Mot de passe est Vide!!");
             }
         }
    }

    @FXML
    public void afficherCommencer(ActionEvent e) {
        showPerButton(incrireButton, RegisterApplication.class.getResource("register.fxml"));
    }

        private void validateLogin() {
            String username = userName.getText();
            String passwordV = password.getText();
            String verifyLogin = "SELECT count(1) from accounts where username = '" + userName.getText() + "' and password = '" + password.getText() + "' ";
            try {
                ResultSet queryResult = connectnow.stm.executeQuery(verifyLogin);
                while (queryResult.next()) {
                    if (queryResult.getInt(1) == 1) {
                        messageLabel.setText("Bienvenue!");
                        afficherHome();
                    } else {
                        messageLabel.setText("Nom d'utilisateur ou mot de passe incorrect.");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private void afficherHome() {
            showPerButton(seConnecterButton, HomeApplication.class.getResource("home.fxml"));
        }

        private void showPerButton(Button button, URL url) {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(url);
                Stage primaryStage = new Stage();
                Scene scene = new Scene(fxmlLoader.load());
                primaryStage.setTitle("N4MBot-Home");
                primaryStage.initStyle(StageStyle.UNDECORATED);
                primaryStage.setScene(scene);
                primaryStage.show();
                Stage stage = (Stage) button.getScene().getWindow();
                stage.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

//        private void show(URL url) {
//            try{
//                FXMLLoader fxmlLoader = new FXMLLoader(url);
//                Stage primaryStage = new Stage();
//                Scene scene = new Scene(fxmlLoader.load());
//                primaryStage.setTitle("N4MBot");
//                primaryStage.initStyle(StageStyle.UNDECORATED);
//                primaryStage.setScene(scene);
//                primaryStage.show();
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        }
}
