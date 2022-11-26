module com.linkedinpark.csye6200.linkedinparkproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.linkedinpark.csye6200.linkedinparkproject to javafx.fxml;
    exports com.linkedinpark.csye6200.linkedinparkproject;
}