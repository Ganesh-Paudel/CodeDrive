module com.passwordmanager.codedrive {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;

    opens com.passwordmanager.codedrive to javafx.fxml;
    exports com.passwordmanager.codedrive;
}