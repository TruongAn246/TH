package com.nta.th;

import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class PrimaryController {

    
    @FXML private TextField txtHeight;
    @FXML private TextField txtweight;
    @FXML private Label lbResult;
    
    public void bmiHandler(ActionEvent event){
        double height= Double.parseDouble(this.txtHeight.getText());
        double weight= Double.parseDouble(this.txtweight.getText());
        double bmi= weight/Math.pow(height,2);
        
        
        

        this.lbResult.setTextFill(Color.DARKCYAN);
        
        if (bmi<18.5)
            lbResult.setText("gay");
        else if (bmi <25.5)
            lbResult.setText("Binh Thuong");
        else{
            this.lbResult.setTextFill(Color.RED);
            lbResult.setText("us");
        }
    } 
    
}
