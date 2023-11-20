module com.example.javabdd {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires waffle.jna;
    opens com.example.javabdd to javafx.fxml;
    exports com.example.javabdd;
}