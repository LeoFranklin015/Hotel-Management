package application;   

import javafx.application.Application;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;  


import javafx.stage.Stage;

public class App extends Application{  
  
    @Override  
    public void start(Stage primaryStage)  {  
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
            System.out.println(getClass().getResource("menu.fxml"));
            try
            {
                Parent root = fxmlLoader.load();
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
            }
            catch(NullPointerException e)
            {
                System.out.println("Error");
            }
            primaryStage.setTitle("Hotel Management");
            primaryStage.show();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

         
    }  
    public static void main (String[] args)  
    {  
        launch(args);  
    }  
  
}  