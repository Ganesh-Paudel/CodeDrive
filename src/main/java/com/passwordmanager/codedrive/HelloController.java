package com.passwordmanager.codedrive;

import com.passwordmanager.codedrive.fileHandling.WriteFile;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TextField titleInput;
    @FXML
    private ComboBox<String> languageChooser;
    @FXML
    private TextArea descriptionInput;
    @FXML
    private TextArea codeInput;
    @FXML
    private Button addButton;

    @FXML
    protected void handleAddButtonClicked(ActionEvent event) {
        String title = titleInput.getText();
        String chosenLanguage = languageChooser.getValue();
        String description = descriptionInput.getText();
        String code = codeInput.getText();

        String concatinatedString = "# " + title + "\n" + "# Language: " + chosenLanguage + "\n" + "# Description \n \t" + description + "\n" + "# Code \n \t" + code;
        System.out.println(concatinatedString);
//        WriteFile fileWriter = new WriteFile(title + ".txt", concatinatedString, 'w');
        try {
            FileWriter writer = new FileWriter(".\\src\\main\\java\\com\\passwordmanager\\codedrive\\fileHandling\\Hello.txt");
            writer.write(concatinatedString);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        languageChooser.getItems().addAll("Java", "C", "C++", "Python", "JavaScript", "Go", "Ruby", "Lua", "C#");

    }
}