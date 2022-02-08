package dk.GoldTeamRules.AttendanceAutomation.GUI.view;

import dk.GoldTeamRules.AttendanceAutomation.BE.Student;
import dk.GoldTeamRules.AttendanceAutomation.GUI.model.StudentModel;
import dk.GoldTeamRules.AttendanceAutomation.util.CurrentStudent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
    }

    public void handleConfirmClick(ActionEvent actionEvent) {
        Student student = CurrentStudent.getInstance(null).getCurrentStudent();

    }
}
