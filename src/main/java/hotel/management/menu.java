package hotel.management;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class menu {

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
        q1++;
        t1.setText(Integer.toString(q1));
    }

    int q2 = 0;
    @FXML
    void add2(ActionEvent event) {
        q2++;
        t2.setText(Integer.toString(q2));
    }

    int q3 = 0;
    @FXML
    void add3(ActionEvent event) {
        q3++;
        t3.setText(Integer.toString(q3));
    }

    int q4 = 0;
    @FXML
    void add4(ActionEvent event) {
        q4++;
        t4.setText(Integer.toString(q4));
    }

    int q5 = 0;
    @FXML
    void add5(ActionEvent event) {
        q5++;
        t5.setText(Integer.toString(q5));
    }

    int q6 = 0;
    @FXML
    void add6(ActionEvent event) {
        q6++;
        t6.setText(Integer.toString(q6));
    }

    int q7 = 0;
    @FXML
    void add7(ActionEvent event) {
        q7++;
        t7.setText(Integer.toString(q7));
    }

    int q8 = 0;
    @FXML
    void add8(ActionEvent event) {
        q8++;
        t8.setText(Integer.toString(q8));
    }

    @FXML
    void sub1(ActionEvent event) {
        if(q1>0)
        q1--;
        t1.setText(Integer.toString(q1));
    }

    @FXML
    void sub2(ActionEvent event) {
        if(q2>0)
        q2--;
        t2.setText(Integer.toString(q2));
    }

    @FXML
    void sub3(ActionEvent event) {
        if(q3>0)
        q3--;
        t3.setText(Integer.toString(q3));
    }

    @FXML
    void sub4(ActionEvent event) {
        if(q4>0)
        q4--;
        t4.setText(Integer.toString(q4));
    }

    @FXML
    void sub5(ActionEvent event) {
        if(q5>0)
        q5--;
        t5.setText(Integer.toString(q5));
    }

    @FXML
    void sub6(ActionEvent event) {
        if(q6>0)
        q6--;
        t6.setText(Integer.toString(q6));
    }

    @FXML
    void sub7(ActionEvent event) {
        if(q7>0)
        q7--;
        t7.setText(Integer.toString(q7));
    }

    @FXML
    void sub8(ActionEvent event) {
        if(q8>0)
        q8--;
        t8.setText(Integer.toString(q8));
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

    @FXML
    void checkStatus()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
			final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","");
			String sql="select status from hotel where id=1";
			PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            q1 = rs.getInt("status");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
