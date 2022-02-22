package dk.GoldTeamRules.AttendanceAutomation.GUI.controller;

import dk.GoldTeamRules.AttendanceAutomation.BE.Classroom;
import dk.GoldTeamRules.AttendanceAutomation.util.CurrentStudent;
import dk.GoldTeamRules.AttendanceAutomation.BE.Student;
import dk.GoldTeamRules.AttendanceAutomation.GUI.model.ClassroomModel;
import dk.GoldTeamRules.AttendanceAutomation.GUI.model.StudentModel;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class StudentHomeViewController implements Initializable {
    @FXML
    private Button confirmClassBtn;
    @FXML
    private ChoiceBox<Classroom> classChoiceBox;
    @FXML
    private Button setClassBtn;
    private ClassroomModel classroomModel;
    private StudentModel studentModel;

    private Classroom classroom;
    private ArrayList<Student> students;

    @FXML
    public TilePane tilePane;

    public StudentHomeViewController() {
        this.classroomModel =  new ClassroomModel();
        this.studentModel = new StudentModel();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.classroom = classroomModel.getClassroom();
        this.students = classroom.getStudents();
        classChoiceBox.setItems(FXCollections.observableArrayList(classroomModel.getAllClassrooms()));
        tilePane.getChildren().addAll(classroomModel.createImageButtons(classroom));
    }



    public void handleClassClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/dk/GoldTeamRules/AttendanceAutomation/GUI/view/ClassesListView.fxml"));
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Attendance Options");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void chooseClassClick(ActionEvent actionEvent) {
        tilePane.getChildren().clear();
        tilePane.getChildren().addAll(classroomModel.createImageButtons(classChoiceBox.getValue()));
    }
}