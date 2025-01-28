package lk.ijse.chat_app_exam.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lk.ijse.chat_app_exam.HelloApplication;

import java.io.IOException;

public class LoginFormController {

    @FXML
    private TextField txtName;

    @FXML
    void logInButtonOnAction(ActionEvent event) throws IOException {
      if (txtName.getText().length()>0){
            Stage stage = (Stage) txtName.getScene().getWindow();


            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ClientForm-1.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage1 = new Stage();
            stage1.setTitle(txtName.getText());
          stage1.setScene(scene);
            stage1.show();
          stage.setOnCloseRequest(windowEvent -> {
              stage1.close();
          });
          stage.show();

            txtName.clear();
        }else{
            new Alert(Alert.AlertType.ERROR, "Please enter your name").show();
        }
    }



}
