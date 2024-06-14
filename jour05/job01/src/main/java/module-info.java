module com.example.job01 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.job01 to javafx.fxml;
    exports com.example.job01;
}