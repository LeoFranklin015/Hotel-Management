module hotel.management {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires io.github.cdimascio.dotenv.java;

    opens hotel.management to javafx.fxml;
    exports hotel.management;
}
