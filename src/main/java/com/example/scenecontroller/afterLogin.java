package com.example.scenecontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class afterLogin {
    @FXML
    private Button logoutButton;
    @FXML
    private BorderPane borderPane;

    Stage stage;

    public void userLogOut(ActionEvent event) throws IOException{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to log out!");
        alert.setContentText("Do you want to save before exiting?");

        if (alert.showAndWait().get() == ButtonType.OK){
            Main main = new Main();
            main.changeScene("LoginForm.fxml");
            System.out.println("Successfully logged out");
        }

    }

}
