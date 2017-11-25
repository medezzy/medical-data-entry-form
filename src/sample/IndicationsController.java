package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class IndicationsController {

    @FXML Button addButton;
    @FXML Button resetAll;
    @FXML TextField routeText;
    @FXML TextArea dosageText;
    @FXML TextArea otherCommentsText;

    @FXML
    protected void handleAddButton(ActionEvent actionEvent){
        Controller.indicationData.add(new Indications(routeText.getText(),dosageText.getText(),otherCommentsText.getText()));
        resetAll();
    }

    @FXML
    protected void handleResetButton(ActionEvent actionEvent){
        resetAll();
    }

    private void resetAll() {
        routeText.setText("");
        dosageText.setText("");
        otherCommentsText.setText("");
    }
}
