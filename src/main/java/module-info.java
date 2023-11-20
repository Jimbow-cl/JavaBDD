module com.example.javabdd {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    opens com.example.javabdd to javafx.fxml;
    exports com.example.javabdd;
}