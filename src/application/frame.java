package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class frame {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ResButton1;

    @FXML
    private Button ResButton2;

    @FXML
    private Button ResButton3;

    @FXML
    private Button ResButton4;

    @FXML
    private Button m1;

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
    void men(ActionEvent e)
    {
  
    }

    @FXML
    void initialize() {
        assert ResButton1 != null : "fx:id=\"ResButton1\" was not injected: check your FXML file 'frame.fxml'.";
        assert ResButton2 != null : "fx:id=\"ResButton2\" was not injected: check your FXML file 'frame.fxml'.";
        assert ResButton3 != null : "fx:id=\"ResButton3\" was not injected: check your FXML file 'frame.fxml'.";
        assert ResButton4 != null : "fx:id=\"ResButton4\" was not injected: check your FXML file 'frame.fxml'.";
        assert ava1 != null : "fx:id=\"ava1\" was not injected: check your FXML file 'frame.fxml'.";
        assert ava2 != null : "fx:id=\"ava2\" was not injected: check your FXML file 'frame.fxml'.";
        assert ava3 != null : "fx:id=\"ava3\" was not injected: check your FXML file 'frame.fxml'.";
        assert ava4 != null : "fx:id=\"ava4\" was not injected: check your FXML file 'frame.fxml'.";

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


