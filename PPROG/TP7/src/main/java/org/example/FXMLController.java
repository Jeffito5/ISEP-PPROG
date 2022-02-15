package org.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {

    @FXML
    private TextField txtFahrenheit;

    @FXML
    private TextField txtCelsius;

    @FXML
    private Button btnSair;

    @FXML
    private Button btnConverter;

    @FXML
    private Button btnLimpar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void converter(ActionEvent event) {
        try {
            double C = Double.parseDouble(txtCelsius.getText());
            txtFahrenheit.setText("" + (1.8 * C + 32));
        } catch (NumberFormatException e) {
            limparCampos();
        }
    }

    private void limparCampos() {
        txtCelsius.setText("");
        txtFahrenheit.setText("");
    }

    @FXML
    void limpar(ActionEvent event) {
        limparCampos();
    }

    @FXML
    void sair(ActionEvent event) {
        System.exit(0);
    }
}
