package dk.GoldTeamRules.AttendanceAutomation.GUI.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class pincodeViewController {

    private int counter;

    @FXML
    private JFXButton pincode1;
    @FXML
    private JFXButton pincode2;
    @FXML
    private JFXButton pincode3;
    @FXML
    private JFXButton pincode4;
    @FXML
    private JFXButton pincode5;
    @FXML
    private JFXButton pincode6;
    @FXML
    private JFXButton pincode7;
    @FXML
    private JFXButton pincode8;
    @FXML
    private JFXButton pincode9;


    public void handleClick1(ActionEvent actionEvent) {
        counter++;
        checkPin();
    }

    public void handleClick2(ActionEvent actionEvent) {
        counter++;
        checkPin();
    }

    public void handleClick3(ActionEvent actionEvent) {
        counter++;
        checkPin();
    }

    public void handleClick4(ActionEvent actionEvent) {
        counter++;
        checkPin();
    }

    public void handleClick5(ActionEvent actionEvent) {
        counter++;
        checkPin();
    }

    public void handleClick6(ActionEvent actionEvent) {
        counter++;
        checkPin();
    }

    public void handleClick7(ActionEvent actionEvent) {
        counter++;
        checkPin();
    }

    public void handleClick8(ActionEvent actionEvent) {
        counter++;
        checkPin();
    }

    public void handleClick9(ActionEvent actionEvent) {
        counter++;
        checkPin();
    }

    private void checkPin()
    {
        if(counter == 4)
        {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/dk/GoldTeamRules/AttendanceAutomation/GUI/view/studentAbsenceView.fxml"));
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setTitle("Absence Options");
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) pincode1.getScene().getWindow();
            stage.close();
        }
    }

}
