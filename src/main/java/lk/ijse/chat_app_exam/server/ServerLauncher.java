package lk.ijse.chat_app_exam.server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import lk.ijse.chat_app_exam.HelloApplication;

import java.io.IOException;

public class ServerLauncher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

//        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../lk.ijse.chat_app_exam/ServerForm-1.fxml"))));
//        primaryStage.setTitle("Server");
//        primaryStage.centerOnScreen();
//        primaryStage.setResizable(false);
//        primaryStage.show();
//
//        Stage stage = new Stage();
//        stage.initModality(Modality.WINDOW_MODAL);
//        stage.initOwner(primaryStage.getScene().getWindow());
//        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../lk.ijse.chat_app_exam/LoginForm-1.fxml"))));
//        stage.setTitle("Chat Chat");
//        stage.centerOnScreen();
//        stage.setResizable(false);
//        stage.show();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginForm-1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Hello!");
        primaryStage.setScene(scene);
        primaryStage.show();

        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("ClientForm-1.fxml"));
        Scene scene1 = new Scene(fxmlLoader1.load());
        Stage stage1 = new Stage();
        stage1.setTitle("Hello!");
        stage1.setScene(scene1);
        stage1.show();

    }
}
