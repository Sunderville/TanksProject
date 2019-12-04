module com.sunderville.tanks {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    exports com.sunderville.tanks to javafx.fxml,javafx.graphics;
    opens com.sunderville.tanks to javafx.fxml,javafx.graphics;
}