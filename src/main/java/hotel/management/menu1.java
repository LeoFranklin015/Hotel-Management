package hotel.management;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

import io.github.cdimascio.dotenv.Dotenv;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class menu1 {

    Dotenv dotenv = Dotenv.load();
    final String passwd = dotenv.get("PASSWD");

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button a1;

    @FXML
    private Button a2;

    @FXML
    private Button a3;

    @FXML
    private Button a4;

    @FXML
    private Button a5;

    @FXML
    private Button a6;

    @FXML
    private Button a7;

    @FXML
    private Button a8;

    @FXML
    private Label i1;

    @FXML
    private Label i2;

    @FXML
    private Label i3;

    @FXML
    private Label i4;

    @FXML
    private Label i5;

    @FXML
    private Label i6;

    @FXML
    private Label i7;

    @FXML
    private Label i8;

    @FXML
    private Label p1;

    @FXML
    private Label p2;

    @FXML
    private Label p3;

    @FXML
    private Label p4;

    @FXML
    private Label p5;

    @FXML
    private Label p6;

    @FXML
    private Label p7;

    @FXML
    private Label p8;

    @FXML
    private Button s1;

    @FXML
    private Button s2;

    @FXML
    private Button s3;

    @FXML
    private Button s4;

    @FXML
    private Button s5;

    @FXML
    private Button s6;

    @FXML
    private Button s7;

    @FXML
    private Button s8;

    @FXML
    private Text t1;

    @FXML
    private Text t2;

    @FXML
    private Text t3;

    @FXML
    private Text t4;

    @FXML
    private Text t5;

    @FXML
    private Text t6;

    @FXML
    private Text t7;

    @FXML
    private Text t8;

    int q1 = 0;

    @FXML
    void add1(ActionEvent event) {
        try 
        {
            q1++;
            t1.setText(Integer.toString(q1));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q1+" where id=1";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    int q2 = 0;
    @FXML
    void add2(ActionEvent event) {
        try 
        {
            q2++;
            t2.setText(Integer.toString(q2));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q2+" where id=2";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    int q3 = 0;
    @FXML
    void add3(ActionEvent event) {
        try 
        {
            q3++;
            t3.setText(Integer.toString(q3));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q3+" where id=3";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    int q4 = 0;
    @FXML
    void add4(ActionEvent event) {
        try 
        {
            q4++;
            t4.setText(Integer.toString(q4));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q4+" where id=4";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    int q5 = 0;
    @FXML
    void add5(ActionEvent event) {
        try 
        {
            q5++;
            t5.setText(Integer.toString(q5));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q5+" where id=5";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    int q6 = 0;
    @FXML
    void add6(ActionEvent event) {
        try 
        {
            q6++;
            t6.setText(Integer.toString(q6));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q6+" where id=6";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    int q7 = 0;
    @FXML
    void add7(ActionEvent event) {
        try 
        {
            q7++;
            t7.setText(Integer.toString(q7));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q7+" where id=7";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    int q8 = 0;
    @FXML
    void add8(ActionEvent event) {
        try 
        {
            q8++;
            t8.setText(Integer.toString(q8));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q8+" where id=8";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void checkStatus(ActionEvent event) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="select status from menu where id=1";
			PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            q1 = rs.getInt("status");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void fetchMenu() {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
            String sql="select * from menu";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            i1.setText(rs.getString(2));
            p1.setText(rs.getString(3));
            q1 = Integer.parseInt(rs.getString(4));
            t1.setText(Integer.toString(q1));
            rs.next();
            i2.setText(rs.getString(2));
            p2.setText(rs.getString(3));
            q2 = Integer.parseInt(rs.getString(4));
            t2.setText(Integer.toString(q2));
            rs.next();
            i3.setText(rs.getString(2));
            p3.setText(rs.getString(3));
            q3 = Integer.parseInt(rs.getString(4));
            t3.setText(Integer.toString(q3));
            rs.next();
            i4.setText(rs.getString(2));
            p4.setText(rs.getString(3));
            q4 = Integer.parseInt(rs.getString(4));
            t4.setText(Integer.toString(q4));
            rs.next();
            i5.setText(rs.getString(2));
            p5.setText(rs.getString(3));
            q5 = Integer.parseInt(rs.getString(4));
            t5.setText(Integer.toString(q5));
            rs.next();
            i6.setText(rs.getString(2));
            p6.setText(rs.getString(3));
            q6 = Integer.parseInt(rs.getString(4));
            t6.setText(Integer.toString(q6));
            rs.next();
            i7.setText(rs.getString(2));
            p7.setText(rs.getString(3));
            q7 = Integer.parseInt(rs.getString(4));
            t7.setText(Integer.toString(q7));
            rs.next();
            i8.setText(rs.getString(2));
            p8.setText(rs.getString(3));
            q8 = Integer.parseInt(rs.getString(4));
            t8.setText(Integer.toString(q8));
            rs.next();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void sub1(ActionEvent event) {
        try
        {
            if(q1>0)
                q1--;
            t1.setText(Integer.toString(q1));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q1+" where id=1";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void sub2(ActionEvent event) {
        try
        {
            if(q2>0)
                q2--;
            t2.setText(Integer.toString(q2));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q2+" where id=2";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void sub3(ActionEvent event) {
        try
        {
            if(q3>0)
                q3--;
            t3.setText(Integer.toString(q3));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q3+" where id=3";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void sub4(ActionEvent event) {
        try
        {
            if(q4>0)
                q4--;
            t4.setText(Integer.toString(q4));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q4+" where id=4";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void sub5(ActionEvent event) {
        try
        {
            if(q5>0)
                q5--;
            t5.setText(Integer.toString(q5));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q5+" where id=5";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void sub6(ActionEvent event) {
        try
        {
            if(q6>0)
                q6--;
            t6.setText(Integer.toString(q6));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q6+" where id=6";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void sub7(ActionEvent event) {
        try
        {
            if(q7>0)
                q7--;
            t7.setText(Integer.toString(q7));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q7+" where id=7";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void sub8(ActionEvent event) {
        try
        {
            if(q8>0)
                q8--;
            t8.setText(Integer.toString(q8));
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",passwd);
			String sql="update menu set quantity="+q8+" where id=8";
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    @FXML
    void backToFrame(ActionEvent e) throws IOException
    {
        App.setRoot("frame");
    }

    @FXML
    void initialize() {
        assert a1 != null : "fx:id=\"a1\" was not injected: check your FXML file 'menu.fxml'.";
        assert a2 != null : "fx:id=\"a2\" was not injected: check your FXML file 'menu.fxml'.";
        assert a3 != null : "fx:id=\"a3\" was not injected: check your FXML file 'menu.fxml'.";
        assert a4 != null : "fx:id=\"a4\" was not injected: check your FXML file 'menu.fxml'.";
        assert a5 != null : "fx:id=\"a5\" was not injected: check your FXML file 'menu.fxml'.";
        assert a6 != null : "fx:id=\"a6\" was not injected: check your FXML file 'menu.fxml'.";
        assert a7 != null : "fx:id=\"a7\" was not injected: check your FXML file 'menu.fxml'.";
        assert a8 != null : "fx:id=\"a8\" was not injected: check your FXML file 'menu.fxml'.";
        assert i1 != null : "fx:id=\"i1\" was not injected: check your FXML file 'menu.fxml'.";
        assert i2 != null : "fx:id=\"i2\" was not injected: check your FXML file 'menu.fxml'.";
        assert i3 != null : "fx:id=\"i3\" was not injected: check your FXML file 'menu.fxml'.";
        assert i4 != null : "fx:id=\"i4\" was not injected: check your FXML file 'menu.fxml'.";
        assert i5 != null : "fx:id=\"i5\" was not injected: check your FXML file 'menu.fxml'.";
        assert i6 != null : "fx:id=\"i6\" was not injected: check your FXML file 'menu.fxml'.";
        assert i7 != null : "fx:id=\"i7\" was not injected: check your FXML file 'menu.fxml'.";
        assert i8 != null : "fx:id=\"i8\" was not injected: check your FXML file 'menu.fxml'.";
        assert p1 != null : "fx:id=\"p1\" was not injected: check your FXML file 'menu.fxml'.";
        assert p2 != null : "fx:id=\"p2\" was not injected: check your FXML file 'menu.fxml'.";
        assert p3 != null : "fx:id=\"p3\" was not injected: check your FXML file 'menu.fxml'.";
        assert p4 != null : "fx:id=\"p4\" was not injected: check your FXML file 'menu.fxml'.";
        assert p5 != null : "fx:id=\"p5\" was not injected: check your FXML file 'menu.fxml'.";
        assert p6 != null : "fx:id=\"p6\" was not injected: check your FXML file 'menu.fxml'.";
        assert p7 != null : "fx:id=\"p7\" was not injected: check your FXML file 'menu.fxml'.";
        assert p8 != null : "fx:id=\"p8\" was not injected: check your FXML file 'menu.fxml'.";
        assert s1 != null : "fx:id=\"s1\" was not injected: check your FXML file 'menu.fxml'.";
        assert s2 != null : "fx:id=\"s2\" was not injected: check your FXML file 'menu.fxml'.";
        assert s3 != null : "fx:id=\"s3\" was not injected: check your FXML file 'menu.fxml'.";
        assert s4 != null : "fx:id=\"s4\" was not injected: check your FXML file 'menu.fxml'.";
        assert s5 != null : "fx:id=\"s5\" was not injected: check your FXML file 'menu.fxml'.";
        assert s6 != null : "fx:id=\"s6\" was not injected: check your FXML file 'menu.fxml'.";
        assert s7 != null : "fx:id=\"s7\" was not injected: check your FXML file 'menu.fxml'.";
        assert s8 != null : "fx:id=\"s8\" was not injected: check your FXML file 'menu.fxml'.";
        assert t1 != null : "fx:id=\"t1\" was not injected: check your FXML file 'menu.fxml'.";
        assert t2 != null : "fx:id=\"t2\" was not injected: check your FXML file 'menu.fxml'.";
        assert t3 != null : "fx:id=\"t3\" was not injected: check your FXML file 'menu.fxml'.";
        assert t4 != null : "fx:id=\"t4\" was not injected: check your FXML file 'menu.fxml'.";
        assert t5 != null : "fx:id=\"t5\" was not injected: check your FXML file 'menu.fxml'.";
        assert t6 != null : "fx:id=\"t6\" was not injected: check your FXML file 'menu.fxml'.";
        assert t7 != null : "fx:id=\"t7\" was not injected: check your FXML file 'menu.fxml'.";
        assert t8 != null : "fx:id=\"t8\" was not injected: check your FXML file 'menu.fxml'.";

    }

}

