module com.passwordmanager.codedrive {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.passwordmanager.codedrive to javafx.fxml;
    exports com.passwordmanager.codedrive;
}