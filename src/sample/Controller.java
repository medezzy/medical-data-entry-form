package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {

    @FXML Button addIndicationsButton;
    @FXML Button submitButton;
    @FXML Button resetButton;

    //Indicattion Table
    @FXML TableView<Indications> indicationTable;
    static ObservableList<Indications> indicationData = FXCollections.observableArrayList();

    //Brand Table
    @FXML TableView<Brands> brandsTableView;
    static ObservableList<Brands> brandsData = FXCollections.observableArrayList();

    @FXML TextField sectionNameText;
    @FXML TextField subSectionNameText;
    @FXML TextField genericNameText;
    @FXML TextArea contractionsText;
    @FXML TextArea specialPrecautionsText;
    @FXML TextArea interactionsText;
    @FXML TextArea adverseDrugReactionsText;

    @FXML
    protected void handleAddIndicationButtonAction(ActionEvent actionEvent){
        createNewWindow("indications.fxml");
        indicationTable.setItems(indicationData);
    }

    @FXML
    protected void handleAddBrandButtonAction(ActionEvent actionEvent){
        createNewWindow("brands.fxml");
        brandsTableView.setItems(brandsData);
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
        sectionNameText.setText("");
        subSectionNameText.setText("");
        genericNameText.setText("");
        contractionsText.setText("");
        specialPrecautionsText.setText("");
        interactionsText.setText("");
        adverseDrugReactionsText.setText("");
        brandsData.clear();
        indicationData.clear();
    }
    @FXML
    protected void submitActionHandler(ActionEvent actionEvent){
        Data data = new Data(sectionNameText.getText(),
                subSectionNameText.getText(),
                genericNameText.getText(),
                new SafetyAlerts(contractionsText.getText(),specialPrecautionsText.getText(),interactionsText.getText(),adverseDrugReactionsText.getText()),
                indicationData,brandsData);
        writeToFile(data);
        resetAll();
    }
    @FXML
    protected void handleResetAll(ActionEvent actionEvent){
        resetAll();
    }


    private void writeToFile(Data data){
        String directoryName = "C://MedicineData//";
        try {
            File directory = new File(directoryName);
            if (! directory.exists()){
                directory.mkdir();
            }
            File file = new File(directoryName+data.getGenericName()+".json");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(data.toString());
            fileWriter.flush();
            fileWriter.close();
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
