/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author iodon
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button btnReset;
    @FXML
    private TextField txtCounter;
    
    
    Thread c = new Thread();
    java.lang.Thread tD = new java.lang.Thread((Runnable) c);
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Reset pushed");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
            tD.start();
        
    }    
    
}
