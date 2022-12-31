package hotel.management;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import io.github.cdimascio.dotenv.Dotenv;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class frame {

    Dotenv dotenv = Dotenv.load();
    final String passwd = dotenv.get("PASSWD");

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
    private Button m2;

    @FXML
    private Button m3;

    @FXML
    private Button m4;

    @FXML
    void getStatus(MouseEvent e) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
            String sql="select * from state";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            if(rs.getBoolean(2) == true)
            {
                reverse1();
            }
            else
            {
                reserved1();
            }
            rs.next();
            if(rs.getBoolean(2) == true)
            {
                reverse2();
            }
            else
            {
                reserved2();
            }
            rs.next();
            if(rs.getBoolean(2) == true)
            {
                reverse3();
            }
            else
            {
                reserved3();
            }
            rs.next();
            if(rs.getBoolean(2) == true)
            {
                reverse4(); 
            }
            else
            {
                reserved4();
            }
        }
        catch (Exception e1)
        {
            e1.printStackTrace();
        }
    }

    @FXML
    void reserved1() {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
            String sql="update state set status=0 where id=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            ResButton1.setDisable(true);
            ava1.setFill(Color.rgb(255,0,0));
            m1.setDisable(false);
        }
        catch(Exception e1)
        {
            e1.printStackTrace();
        }

    }
    
    void reverse1() {
        ResButton1.setDisable(false);
        ava1.setFill(Color.rgb(0,255,0));
        m1.setDisable(true);
    }

    @FXML
    void reserved2() {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
            String sql="update state set status=0 where id=2";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            ResButton2.setDisable(true);
            ava2.setFill(Color.rgb(255,0,0));
            m2.setDisable(false);
        }
        catch(Exception e1)
        {
            e1.printStackTrace();
        }
    }

    void reverse2() {
        ResButton2.setDisable(false);
        ava2.setFill(Color.rgb(0,255,0));
        m2.setDisable(true);
    }

    @FXML
    void reserved3() {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
            String sql="update state set status=0 where id=3";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            ResButton3.setDisable(true);
            ava3.setFill(Color.rgb(255,0,0));
            m3.setDisable(false);
        }
        catch(Exception e1)
        {
            e1.printStackTrace();
        }
    }

    void reverse3() {
        ResButton3.setDisable(false);
        ava3.setFill(Color.rgb(0,255,0));
        m3.setDisable(true);
    }

    @FXML
    void reserved4() {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
            String sql="update state set status=0 where id=4";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            ResButton4.setDisable(true);
            ava4.setFill(Color.rgb(255,0,0));
            m4.setDisable(false);
        }
        catch(Exception e1)
        {
            e1.printStackTrace();
        }
    }

    void reverse4() {
        ResButton4.setDisable(false);
        ava4.setFill(Color.rgb(0,255,0));
        m4.setDisable(true);
    }

    @FXML
    void menu1() throws IOException
    {
        App.setRoot("menu1");

    }

    @FXML
    void menu2() throws IOException
    {
        App.setRoot("menu2");
    }

    @FXML
    void menu3() throws IOException
    {
        App.setRoot("menu3");
    }

    @FXML
    void menu4() throws IOException
    {
        App.setRoot("menu4");
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


