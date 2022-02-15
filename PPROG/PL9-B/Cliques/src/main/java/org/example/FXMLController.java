package org.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    int counter = 0;
    @FXML
    private Label txtNumCliques;

    @FXML
    private TextField lblCounter;

    @FXML
    private Button btnClica;

    @FXML
    void aumenta_cliques(ActionEvent event) {
        counter++;
        lblCounter.setText(String.valueOf(counter));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lblCounter.setText(String.valueOf(counter));
    }
}
