package application;   
import javafx.application.Application;  
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;  
public class App extends Application{  
  
    @Override  
    public void start(Stage primaryStage)  {  
        try {
            GridPane gp = new GridPane();
            Scene scene = new Scene(gp);
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