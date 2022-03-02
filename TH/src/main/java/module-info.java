module com.nta.th {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nta.th to javafx.fxml;
    exports com.nta.th;
}
