/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dei.pl16;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import org.dei.pl16.model.Data;
import org.dei.pl16.model.DiaInvalidoException;
import org.dei.pl16.model.MesInvalidoException;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 */
public class SceneController implements Initializable {
    String data;
    @FXML
    private TextField txtData;
    @FXML
    private TextField txtDia;
    @FXML
    private Button btnDia;
    @FXML
    private Button btnExtenso;
    @FXML
    private Button btnLimpar;
    @FXML
    private TextField txtExtenso;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void diaDaSemanaAction() {
        data = txtData.getText();
        String dadosData[] = data.split("/");
        int ano = Integer.parseInt(dadosData[0]);
        int mes = Integer.parseInt(dadosData[1]);
        int dia = Integer.parseInt(dadosData[2]);
        try {
            Data newData = new Data(ano, mes, dia);
            txtDia.setText(newData.diaDaSemana());
        } catch (MesInvalidoException mesInvalidoException) {
            showError(mesInvalidoException.getMessage());
        } catch (DiaInvalidoException diaInvalidoException) {
            showError(diaInvalidoException.getMessage());
        }
    }

    public void showError(String mesage) {
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setHeaderText("Input not valid!");
        errorAlert.setContentText(mesage);
        errorAlert.showAndWait();
    }

    @FXML
    private void dataPorExtensoAction() {
        data = txtData.getText();
        String dadosData[] = data.split("/");
        int ano = Integer.parseInt(dadosData[0]);
        int mes = Integer.parseInt(dadosData[1]);
        int dia = Integer.parseInt(dadosData[2]);
        try {
            Data newData = new Data(ano, mes, dia);
            txtExtenso.setText(newData.toString());
        } catch (MesInvalidoException mesInvalidoException) {
            showError(mesInvalidoException.getMessage());
        } catch (DiaInvalidoException diaInvalidoException) {
            showError(diaInvalidoException.getMessage());
        }


    }

    @FXML
    private void limparAction(ActionEvent event) {
        txtData.setText("");
        txtExtenso.setText("");
        txtDia.setText("");
        txtData.requestFocus();
    }

    @FXML
    private void setOnKeyPressed(KeyEvent event) {

        if (event.getCode() == KeyCode.ENTER) {
            diaDaSemanaAction();
            dataPorExtensoAction();

        }
    }


}
