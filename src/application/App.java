package application;   
import javafx.application.Application;  
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;  
public class App extends Application{  
  
    @Override  
    public void start(Stage primaryStage)  {  
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("frame.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Hotel Management");
            primaryStage.show();

        } catch (Exception e) {
            
        }

         
    }  
    public static void main (String[] args)  
    {  
        launch(args);  
    }  
  
}  