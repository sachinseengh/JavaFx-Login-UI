/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package login.ui;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.EventHandler;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;

import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author sachi
 */
public class LoginUI extends Application {
    
    private double x=0;
    private double y=0;
    
    
    
    
    @Override
    public void start(Stage primaryStage) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        
        Scene scene = new Scene(root);
        
        
        root.setOnMousePressed(new EventHandler<MouseEvent>(){

                    public void handle(MouseEvent event){
                    
                    x = event.getSceneX();
                    y= event.getSceneY();
                    }


        });
        
        
        root.setOnMouseDragged(new EventHandler<MouseEvent>(){
        
        
               public void handle(MouseEvent event){
                   
                   
        
                    primaryStage.setX(event.getScreenX()-x);
                    primaryStage.setY(event.getScreenY()-y);
       
        
        }
          });
        
        
        
        
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("E Vote");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
