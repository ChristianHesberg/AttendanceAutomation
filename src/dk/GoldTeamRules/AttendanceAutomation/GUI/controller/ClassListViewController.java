package dk.GoldTeamRules.AttendanceAutomation.GUI.controller;

import com.jfoenix.controls.JFXButton;
import dk.GoldTeamRules.AttendanceAutomation.BE.Classroom;
import dk.GoldTeamRules.AttendanceAutomation.BE.Teacher;
import dk.GoldTeamRules.AttendanceAutomation.BLL.ClassroomLogic;
import dk.GoldTeamRules.AttendanceAutomation.GUI.model.ClassroomModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ClassListViewController implements Initializable {
    @FXML
    private JFXButton confirmClassBtn;
    private ClassroomLogic classroomLogic;
    private ClassroomModel classroomModel;

    @FXML
    private ListView<Classroom> listViewClasses;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.classroomLogic = new ClassroomLogic();
        this.classroomModel = new ClassroomModel();
        ObservableList<Classroom> classroomObservableList = FXCollections.observableList(classroomLogic.getAllClassrooms());
        listViewClasses.setItems(classroomObservableList);

    }

    public void handleClick(ActionEvent actionEvent) {
        Classroom classroom = listViewClasses.getSelectionModel().getSelectedItem();
        classroomModel.createImageButtons(classroom);

    }
}
