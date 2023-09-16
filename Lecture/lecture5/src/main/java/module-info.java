module com.example.week5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week5 to javafx.fxml;
    exports com.example.week5;
}