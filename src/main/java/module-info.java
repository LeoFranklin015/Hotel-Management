module hotel.management {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens hotel.management to javafx.fxml;
    exports hotel.management;
}
