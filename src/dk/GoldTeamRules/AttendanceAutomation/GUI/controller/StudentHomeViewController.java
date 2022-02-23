package dk.GoldTeamRules.AttendanceAutomation.GUI.controller;

import dk.GoldTeamRules.AttendanceAutomation.BE.Classroom;
import dk.GoldTeamRules.AttendanceAutomation.BE.Student;
import dk.GoldTeamRules.AttendanceAutomation.GUI.model.ClassroomModel;
import dk.GoldTeamRules.AttendanceAutomation.GUI.model.StudentModel;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class StudentHomeViewController implements Initializable {
    @FXML
    private TilePane tilePane;
    @FXML
    private Button searchBtn;
    @FXML
    private TextField searchBar;
    @FXML
    private Button confirmClassBtn;
    @FXML
    private ChoiceBox<Classroom> classChoiceBox;

    private ClassroomModel classroomModel;
    private StudentModel studentModel;

    private Classroom classroom;
    private ArrayList<Student> students;


    public StudentHomeViewController() {
        this.classroomModel =  new ClassroomModel();
        this.studentModel = new StudentModel();
        CustomActionListener listener = new CustomActionListener();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        classChoiceBox.setItems(FXCollections.observableArrayList(classroomModel.getAllClassrooms()));
        classChoiceBox.setValue(classroomModel.getAllClassrooms().get(0));
        this.classroom = classChoiceBox.getValue();
        this.students = classroom.getStudents();
        tilePane.getChildren().addAll(classroomModel.createImageButtons(classChoiceBox.getValue().getStudents()));
    }

    private void repopulateTilePane(ArrayList<ImageView> updatedImageViews)
    {
        tilePane.getChildren().clear();
        tilePane.getChildren().addAll(updatedImageViews);
    }

    public void chooseClassClick(ActionEvent actionEvent) {
        repopulateTilePane(classroomModel.createImageButtons(classChoiceBox.getValue().getStudents()));
    }

    public void handleSearch(ActionEvent actionEvent) {
        ArrayList<Student> studentsFiltered = new ArrayList<>();
        String query = searchBar.getText().toLowerCase().trim();
        for(Student s : students)
        {
            if(s.getName().toLowerCase().trim().equals(query))
            {
                studentsFiltered.add(s);
            }
        }
        repopulateTilePane(classroomModel.createImageButtons(studentsFiltered));
        if(query.equals(""))
        {
            repopulateTilePane(classroomModel.createImageButtons(classChoiceBox.getValue().getStudents()));
        }

    }

    class CustomActionListener implements ActionListener{

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {

            repopulateTilePane(classroomModel.createImageButtons(classChoiceBox.getValue().getStudents()));
        }
    }

}