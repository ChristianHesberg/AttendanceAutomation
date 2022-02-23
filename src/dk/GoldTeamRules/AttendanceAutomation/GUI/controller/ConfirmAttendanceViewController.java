package dk.GoldTeamRules.AttendanceAutomation.GUI.controller;

import dk.GoldTeamRules.AttendanceAutomation.BE.Student;
import dk.GoldTeamRules.AttendanceAutomation.GUI.model.StudentModel;
import dk.GoldTeamRules.AttendanceAutomation.util.CurrentStudent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ConfirmAttendanceViewController implements Initializable {

    private StudentModel studentModel;

    @FXML
    private Label studentNameLbl;
    @FXML
    private Button editAttendanceBtn;
    @FXML
    private Button confirmAttendanceBtn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.studentNameLbl.setText(CurrentStudent.getInstance(null).getCurrentStudent().toString());
        this.studentModel = new StudentModel();

    }

    public void handleEditClick(ActionEvent actionEvent) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/dk/GoldTeamRules/AttendanceAutomation/GUI/view/pincodeView.fxml"));
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Enter Pin-code");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void handleConfirmClick(ActionEvent actionEvent) throws InterruptedException {
        Stage stage = (Stage) confirmAttendanceBtn.getScene().getWindow();
        stage.close();

    }
}
