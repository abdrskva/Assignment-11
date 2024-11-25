module com.example.assignment11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment11 to javafx.fxml;
    exports com.example.assignment11;
}