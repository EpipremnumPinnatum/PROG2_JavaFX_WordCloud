package ch.zhaw.prog2.wordcloud;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class MainWindowController {


    @FXML private Button hinzufuegenText;
    @FXML private Label lableTitel;
    @FXML private Button leerenTextEingabe;
    @FXML private TextField textEingabe;
    @FXML private TextArea textHistory;

    public void initialize() {
        lableTitel.textProperty().bind(textEingabe.textProperty());
    }

    @FXML
    private void hinzufuegenText(ActionEvent event){
        textHistory.appendText(textEingabe.getText()+System.lineSeparator());
    }
    @FXML
    private void leerenTextEIngabe(ActionEvent event){
        textEingabe.clear();
    }

}
