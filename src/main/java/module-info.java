module lk.ijse.chat_app_exam {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.ijse.chat_app_exam to javafx.fxml;
    exports lk.ijse.chat_app_exam;
    exports lk.ijse.chat_app_exam.controller;
    opens lk.ijse.chat_app_exam.controller to javafx.fxml;
}