module com.example.prak6_lat1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prak6_lat1 to javafx.fxml;
    exports com.example.prak6_lat1;
}