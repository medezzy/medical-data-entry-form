package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class BrandsController {
    @FXML TextField medicineNameText;
    @FXML TextField manufacturerNameText;
    @FXML TextArea contentText;
    @FXML TableView presentationTable;
    @FXML TextArea commentsText;
    @FXML Button addPresentationButton;
    static ObservableList<Presentation> presentations = FXCollections.observableArrayList();

    @FXML
    protected void addPresentationButtonHandler(ActionEvent actionEvent){
        createNewWindow("presentation.fxml");
        presentationTable.setItems(presentations);
    }

    @FXML
    protected void addBrandButtonHandler(ActionEvent actionEvent){
        Controller.brandsData.add(new Brands(medicineNameText.getText(),manufacturerNameText.getText(),contentText.getText(),commentsText.getText(),presentations));
        resetAll();
    }

    @FXML
    protected void resetAllButtonHandler(ActionEvent actionEvent){
        resetAll();
    }

    private void createNewWindow(String fxmlName){
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlName));
        Scene newScene;
        try {
            newScene = new Scene(loader.load());
        } catch (IOException ex) {
            return;
        }
        Stage inputStage = new Stage();
        inputStage.setHeight(600);
        inputStage.setWidth(800);
        inputStage.setScene(newScene);
        inputStage.showAndWait();
    }

    private void resetAll(){
        medicineNameText.setText("");
        manufacturerNameText.setText("");
        contentText.setText("");
        commentsText.setText("");
        presentations.clear();
    }
}
