package com.example.movielibraryltu;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable{

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button createAccountButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Add initialization logic here if needed
    }

    @FXML
    private void handleLogin() {
        // Implement the login functionality here
        String username = usernameField.getText();
        String password = passwordField.getText();
        // Perform login validation and further actions
    }

    @FXML
    private void handleCreateAccount() {
        // Implement the create account functionality here
        // Redirect to the account creation screen or perform necessary actions
    }
}

