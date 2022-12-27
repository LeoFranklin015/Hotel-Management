package hotel.management;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import io.github.cdimascio.dotenv.Dotenv;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class bill4 {

    Dotenv dotenv = Dotenv.load();
    final String passwd = dotenv.get("PASSWD");

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text item1;

    @FXML
    private Text item2;

    @FXML
    private Text item3;

    @FXML
    private Text item4;

    @FXML
    private Text item5;

    @FXML
    private Text item6;

    @FXML
    private Text item7;

    @FXML
    private Text item8;

    @FXML
    private Text price1;

    @FXML
    private Text price2;

    @FXML
    private Text price3;

    @FXML
    private Text price4;

    @FXML
    private Text price5;

    @FXML
    private Text price6;

    @FXML
    private Text price7;

    @FXML
    private Text price8;

    @FXML
    private Text qty1;
    
    @FXML
    private Text qty2;

    @FXML
    private Text qty3;

    @FXML
    private Text qty4;

    @FXML
    private Text qty5;

    @FXML
    private Text qty6;

    @FXML
    private Text qty7;

    @FXML
    private Text qty8;

    @FXML
    private Text total;

    @FXML
    void getBill()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
            String sql="select * from menu4";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            item1.setText(rs.getString(2));
            price1.setText(rs.getString(3));
            qty1.setText(rs.getString(4));
            rs.next();
            item2.setText(rs.getString(2));
            price2.setText(rs.getString(3));
            qty2.setText(rs.getString(4));
            rs.next();
            item3.setText(rs.getString(2));
            price3.setText(rs.getString(3));
            qty3.setText(rs.getString(4));
            rs.next();
            item4.setText(rs.getString(2));
            price4.setText(rs.getString(3));
            qty4.setText(rs.getString(4));
            rs.next();
            item5.setText(rs.getString(2));
            price5.setText(rs.getString(3));
            qty5.setText(rs.getString(4));
            rs.next();
            item6.setText(rs.getString(2));
            price6.setText(rs.getString(3));
            qty6.setText(rs.getString(4));
            rs.next();
            item7.setText(rs.getString(2));
            price7.setText(rs.getString(3));
            qty7.setText(rs.getString(4));
            rs.next();
            item8.setText(rs.getString(2));
            price8.setText(rs.getString(3));
            qty8.setText(rs.getString(4));
            rs.next();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void saveBill()
    {

    }

    @FXML
    void backToMenu(ActionEvent e) throws IOException
    {
        App.setRoot("menu4");
    }


    @FXML
    void initialize() {
        assert item1 != null : "fx:id=\"item1\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert item2 != null : "fx:id=\"item2\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert item3 != null : "fx:id=\"item3\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert item4 != null : "fx:id=\"item4\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert item5 != null : "fx:id=\"item5\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert item6 != null : "fx:id=\"item6\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert item7 != null : "fx:id=\"item7\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert item8 != null : "fx:id=\"item8\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price1 != null : "fx:id=\"price1\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price2 != null : "fx:id=\"price2\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price3 != null : "fx:id=\"price3\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price4 != null : "fx:id=\"price4\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price5 != null : "fx:id=\"price5\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price6 != null : "fx:id=\"price6\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price7 != null : "fx:id=\"price7\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price8 != null : "fx:id=\"price8\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty1 != null : "fx:id=\"qty1\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty2 != null : "fx:id=\"qty2\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty3 != null : "fx:id=\"qty3\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty4 != null : "fx:id=\"qty4\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty5 != null : "fx:id=\"qty5\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty6 != null : "fx:id=\"qty6\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty7 != null : "fx:id=\"qty7\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty8 != null : "fx:id=\"qty8\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert total != null : "fx:id=\"total\" was not injected: check your FXML file 'Untitled.fxml'.";

    }

}
