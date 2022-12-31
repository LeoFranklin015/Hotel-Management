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

public class bill1 {

    Dotenv dotenv = Dotenv.load();
    final String passwd = dotenv.get("PASSWD");

    int amt = 0;

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
            String sql="select * from menu1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            amt = 0;
            rs.next();
            if(rs.getInt(4) > 0) {
                amt += rs.getInt(3)*rs.getInt(4);
            }
            item1.setText(rs.getString(2));
            price1.setText(rs.getString(3));
            qty1.setText(rs.getString(4));
            rs.next();
            if(rs.getInt(4) > 0) {
                amt += rs.getInt(3)*rs.getInt(4);
            }
            item2.setText(rs.getString(2));
            price2.setText(rs.getString(3));
            qty2.setText(rs.getString(4));
            rs.next();
            if(rs.getInt(4) > 0) {
                amt += rs.getInt(3)*rs.getInt(4);
            }
            item3.setText(rs.getString(2));
            price3.setText(rs.getString(3));
            qty3.setText(rs.getString(4));
            rs.next();
            if(rs.getInt(4) > 0) {
                amt += rs.getInt(3)*rs.getInt(4);
            }
            item4.setText(rs.getString(2));
            price4.setText(rs.getString(3));
            qty4.setText(rs.getString(4));
            rs.next();
            if(rs.getInt(4) > 0) {
                amt += rs.getInt(3)*rs.getInt(4);
            }
            item5.setText(rs.getString(2));
            price5.setText(rs.getString(3));
            qty5.setText(rs.getString(4));
            rs.next();
            if(rs.getInt(4) > 0) {
                amt += rs.getInt(3)*rs.getInt(4);
            }
            item6.setText(rs.getString(2));
            price6.setText(rs.getString(3));
            qty6.setText(rs.getString(4));
            rs.next();
            if(rs.getInt(4) > 0) {
                amt += rs.getInt(3)*rs.getInt(4);
            }
            item7.setText(rs.getString(2));
            price7.setText(rs.getString(3));
            qty7.setText(rs.getString(4));
            rs.next();
            if(rs.getInt(4) > 0) {
                amt += rs.getInt(3)*rs.getInt(4);
            }
            item8.setText(rs.getString(2));
            price8.setText(rs.getString(3));
            qty8.setText(rs.getString(4));
            rs.next();
            total.setText(Integer.toString(amt));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void saveBill()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
            String sql="update state set status=1 where id=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            sql = "update menu1 set quantity=0 where id";
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            App.setRoot("frame");
        }
        catch(Exception e1)
        {
            e1.printStackTrace();
        }
    }

    @FXML
    void backToMenu(ActionEvent e) throws IOException
    {
        App.setRoot("menu1");
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
        assert item8 != null : "fx:id=\"item7\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price1 != null : "fx:id=\"price1\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price2 != null : "fx:id=\"price2\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price3 != null : "fx:id=\"price3\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price4 != null : "fx:id=\"price4\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price5 != null : "fx:id=\"price5\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price6 != null : "fx:id=\"price6\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price7 != null : "fx:id=\"price7\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert price8 != null : "fx:id=\"price7\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty1 != null : "fx:id=\"qty1\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty2 != null : "fx:id=\"qty2\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty3 != null : "fx:id=\"qty3\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty4 != null : "fx:id=\"qty4\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty5 != null : "fx:id=\"qty5\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty6 != null : "fx:id=\"qty6\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty7 != null : "fx:id=\"qty7\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert qty8 != null : "fx:id=\"qty7\" was not injected: check your FXML file 'Untitled.fxml'.";
        assert total != null : "fx:id=\"ta\" was not injected: check your FXML file 'Untitled.fxml'.";

    }

}
