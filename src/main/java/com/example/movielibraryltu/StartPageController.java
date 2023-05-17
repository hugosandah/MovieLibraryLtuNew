package com.example.movielibraryltu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class StartPageController  implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//kopiera dessa två
    }
    @FXML
    private Button cancelButton;
    @FXML
    private Button loanButton;




@FXML
    public void cancelButtonOnAction(ActionEvent e){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();



}
    public void onLoad() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Loan.fxml"));
        Parent myPagesParent = fxmlLoader.load();
        Scene myPagesScene = new Scene(myPagesParent);
        Stage currentStage = (Stage) loanButton.getScene().getWindow();
        currentStage.setScene(myPagesScene);
    }

}