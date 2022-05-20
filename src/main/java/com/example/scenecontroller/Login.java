package com.example.scenecontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Login {

    @FXML
    private Button loginButton;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void userLogin(ActionEvent event) throws IOException{
        checkLogin();
    }

    private void checkLogin() throws IOException{
        Main main = new Main();
        if(username.getText().toString().equals("homuhomy") && password.getText().toString().equals("1998")){
            wrongLogin.setText("Successful!");
            main.changeScene("afterLogin.fxml");
        }
        else if(username.getText().isEmpty() && password.getText().isEmpty()){
            wrongLogin.setText("Please enter your username & password.");
        }
        else{
            wrongLogin.setText("Wrong username or password!");
        }
    }

}
