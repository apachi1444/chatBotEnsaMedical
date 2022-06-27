package com.n4mbot.master.chats.alexa;

import com.n4mbot.master.home.HomeApplication;
import com.n4mbot.service.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import java.util.UUID;

import java.net.URL;



public class AlexaController {

    @FXML
    private Button goBack;
    @FXML
    private TextField messgaeTextField;
    @FXML
    private VBox clientVBox;
    @FXML
    private VBox robotVBox;
    @FXML
    private ImageView imageViewMe;
    @FXML
    private ScrollPane scrollPane;


    private final Main main = new Main("alexa.xml");

    public void goBackOnAction(ActionEvent event) {
        showByButton(goBack, HomeApplication.class.getResource("home.fxml"));
    }

    public void send2(){
        String message = messgaeTextField.getText();
//        Image image = new Image("D:\\n4mbot\\src\\main\\resources\\com\\n4mbot\\master\\chats\\alexa\\images\\moi.png");
        if (!message.isEmpty()) {
            clientVBox.getChildren().add(addLebelToVBox(message, Pos.CENTER_RIGHT));
            imageViewMe.setVisible(true);
            messgaeTextField.clear();
            robotVBox.getChildren().add(addLebelToVBox(main.send(message, main.bot), Pos.CENTER_LEFT));
        }
    }

    private Label addLebelToVBox(String message, Pos pos){
        Label label = new Label();
        label.setText(message);
        label.setPadding(new Insets(20,0,0, 0));
        label.setAlignment(pos);
        label.setFont(Font.font("System", FontPosture.findByName("BOLD"),14));
        label.setTextFill(Paint.valueOf("White"));
        label.setStyle("-fx-background-radius: 20px" + ";-fx-background-color: Transparent");
        label.setWrapText(true);
        return label;
    }

    private void showByButton(Button button, URL url){
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

}