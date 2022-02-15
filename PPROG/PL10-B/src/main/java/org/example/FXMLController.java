package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FXMLController implements Initializable {
    private List<String> letters = new ArrayList<>();
    private List<String> listLetters;

    @FXML
    private Button btnConfirmar;

    @FXML
    private TextField txtQuant;

    @FXML
    private Button btnShiftDir;

    @FXML
    private Button btnShiftEsq;

    @FXML
    private TextArea lblSwitch;

    List<String> getListLetters(int num) throws IllegalArgumentException {

        if (num <= 2 || num >= 8) {
            throw new IllegalArgumentException("The number entered it's not acceptable.");
        }
        List<String> listaLetra = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            listaLetra.add(letters.get(i));
        }
        return listaLetra;
    }

    @FXML
    void shiftEsquerda(ActionEvent event) {
        String first = listLetters.get(0);
        listLetters.remove(first);
        listLetters.add(first);
        lblSwitch.setText(textToPresent(listLetters));
    }

    @FXML
    void shiftDireita(ActionEvent event) {
        String last = listLetters.get(listLetters.size() - 1);
        listLetters.remove(last);
        listLetters.add(0, last);
        lblSwitch.setText(textToPresent(listLetters));
    }

    @FXML
    void btnConfirmAction(ActionEvent event) {
        try {
            int choosen = Integer.parseInt(txtQuant.getText());
            listLetters = getListLetters(choosen);
            String lblText = textToPresent(listLetters);
            lblSwitch.setText(lblText);
        } catch (IllegalArgumentException exception) {
            showError(exception.getMessage());
        } catch (Exception exception) {
            showError(exception.getMessage());
        }

    }

    String textToPresent(List<String> listLetters) {
        String lblText = "";
        for (String str : listLetters) {
            lblText = lblText + String.format("  %s", str);
        }
        return String.format("%s", lblText.trim());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("G");

    }

    public void showError(String mesage) {
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setHeaderText("Input not valid!");
        errorAlert.setContentText(mesage);
        errorAlert.showAndWait();
    }
}