package com.n4mbot.master.register;

import com.n4mbot.dao.DataBaseConnection;
import com.n4mbot.master.hello.HelloApplication;
import com.n4mbot.master.login.LoginApplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.sql.SQLIntegrityConstraintViolationException;

public class RegisterController {
    @FXML
    private Button registerButton;
    @FXML
    private Button precedentButton;
    @FXML
    private Label confirmPasswordLabel;
    @FXML
    private Button closeButton;
    @FXML
    private Label registrationMessageLabel;
    @FXML
    private PasswordField setPasswordField;
    @FXML
    private PasswordField confirmPasswordField;
    @FXML
    private TextField firstnameTextField;
    @FXML
    private TextField lastnameTextField;
    @FXML
    private TextField usernameTextField;

    @FXML
    private static int k = 1;

    /// Connection DataBase
    DataBaseConnection connectnow = new DataBaseConnection();

    public void registerUser() {
        String firstname = firstnameTextField.getText();
        String lastname = lastnameTextField.getText();
        String username = usernameTextField.getText();
        String password = setPasswordField.getText();
        String insertToRegister = "insert into accounts(firstname,lastname,username,password) values('" + firstname + "','" + lastname + "','" + username + "','" + password + "');";
        try {
            connectnow.stm.executeUpdate(insertToRegister);
            System.out.println("succès");
//            if (k != 0) {
//                afficherLogin();
//            }
        } catch (SQLIntegrityConstraintViolationException a) {
            confirmPasswordLabel.setText("Le Nom d'utilisateur déja existe");
            k = 0;

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void registerButtonOnAction(ActionEvent event) {
        int a = confirmPassword();
        if (a == 1 && k != 0) {
            afficherLogin();
        }
    }

    public void closeButtonOnAction(ActionEvent Event) {
        closeByButton(closeButton);
    }

    public void afficherLogin() {
        showPerButton(registerButton, LoginApplication.class.getResource("login.fxml"), "Login");
    }

    public void afficherHello() {
        showPerButton(precedentButton, HelloApplication.class.getResource("hello.fxml"),"Hello");
    }

        private void closeByButton(Button button) {
            Stage stage = (Stage) button.getScene().getWindow();
            stage.close();
        }

        private int confirmPassword() {
            if (firstnameTextField.getText().isEmpty()) {
                confirmPasswordLabel.setText("Le Nom est Vide");
                return -1;
            } else if (lastnameTextField.getText().isEmpty()) {
                confirmPasswordLabel.setText("Le Prénom est Vide");
                return -2;
            } else if (usernameTextField.getText().isEmpty()) {
                confirmPasswordLabel.setText("Le Nom d'utilisateur est Vide");
                return -3;
            } else if ((setPasswordField.getText() == "") || (confirmPasswordField.getText() == "")) {
                confirmPasswordLabel.setText("Mot de Passe est Vide");
                return -4;
            } else if (setPasswordField.getText().length() < 8) {
                confirmPasswordLabel.setText("Le Mot de Passe doit contenir au moins 8 caractères");
                return -5;
            } else if (!setPasswordField.getText().equals(confirmPasswordField.getText())) {
                confirmPasswordLabel.setText("les Mots de passe ne sont pas identiques");
                return -6;
            } else {
                confirmPasswordLabel.setText("");
                confirmPasswordLabel.setText("Enregistrement avec succès");
                registerUser();
                return 1;
            }
        }

        private void showPerButton(Button button, URL url, String nom) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(url);
                Stage primaryStage = new Stage();
                Scene scene = new Scene(fxmlLoader.load());
                primaryStage.setTitle("N4MBOT-" + nom);
                primaryStage.initStyle(StageStyle.UNDECORATED);
                primaryStage.setScene(scene);
                primaryStage.show();
                Stage stage = (Stage) button.getScene().getWindow();
                stage.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

}
