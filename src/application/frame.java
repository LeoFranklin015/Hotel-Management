package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class frame {

    @FXML
    private Button ResButton1;

    @FXML
    private Button ResButton2;

    @FXML
    private Button ResButton3;

    @FXML
    private Button ResButton4;

    @FXML
    void reserved1(ActionEvent e) {
        ResButton1.setText("Reserved");
        ava1.setFill(Color.rgb(255,0,0));

    }

    @FXML
    void reserved2(ActionEvent e) {
        ResButton2.setText("Reserved");
        ava2.setFill(Color.rgb(255,0,0));
    }

    @FXML
    void reserved3(ActionEvent e) {
        ResButton3.setText("Reserved");
        ava3.setFill(Color.rgb(255,0,0));
    }

    @FXML
    void reserved4(ActionEvent e) {
        ResButton4.setText("Reserved");
        ava4.setFill(Color.rgb(255,0,0));
    }

    @FXML
    private Circle ava1;

    @FXML
    private Circle ava2;

    @FXML
    private Circle ava3;

    @FXML
    private Circle ava4;

}
