/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package login.ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author sachi
 */
public class FXMLController implements Initializable {
    
    
     @FXML
    private Label eLabel;

    @FXML
    private Label eVote;

public void exit(){
    System.exit(0);
}

    @Override
    public void initialize(URL url, ResourceBundle rb) {
                DropShadow shadow = new DropShadow(40,  Color.valueOf("#1c74ae"));
                
                
                eLabel.setEffect(shadow);
//                eVote.setEffect(shadow);


                DropShadow shadow2 = new DropShadow(40,Color.valueOf("#35769e"));
                eVote.setEffect(shadow2);
    }    
    
}
