module com.suma {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.suma to javafx.fxml;

    exports com.suma;


}
