package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PresentationController {
    @FXML TextField typeText;
    @FXML TextField unitText;
    @FXML TextField priceText;
    @FXML
    protected void handleAddPresentation(ActionEvent actionEvent){
        BrandsController.presentations.add(new Presentation(typeText.getText(),unitText.getText(),priceText.getText()));
        resetAll();
    }
    @FXML
    protected void handleResetAll(ActionEvent actionEvent){
        resetAll();
    }

    private void resetAll(){
        typeText.setText("");
        unitText.setText("");
        priceText.setText("");
    }
}
