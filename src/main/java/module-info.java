module com.foxtrot.dynamxutils {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.foxtrot.dynamxutils to javafx.fxml;
    exports com.foxtrot.dynamxutils;
}