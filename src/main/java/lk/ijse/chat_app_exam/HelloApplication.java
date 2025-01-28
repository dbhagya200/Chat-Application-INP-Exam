package lk.ijse.chat_app_exam;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ServerForm-1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        
       FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("LoginForm-1.fxml"));
        Scene scene1 = new Scene(fxmlLoader1.load());
        Stage stage1 = new Stage();
        stage1.setTitle("Hello!");
        stage1.setScene(scene1);
        stage1.show();
    }

    public static void main(String[] args) {
        launch();
    }
}