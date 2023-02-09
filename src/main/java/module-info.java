module com.example.deco {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.deco to javafx.fxml;
    exports com.example.deco;
    exports com.example.deco.model;
    opens com.example.deco.model to javafx.fxml;
}