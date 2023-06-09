module com.example.vocabulary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.peoples_name to javafx.fxml;
    exports com.example.peoples_name;
}