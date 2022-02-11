package dk.GoldTeamRules.AttendanceAutomation.GUI.controller;

import dk.GoldTeamRules.AttendanceAutomation.BE.Classroom;
import dk.GoldTeamRules.AttendanceAutomation.util.CurrentStudent;
import dk.GoldTeamRules.AttendanceAutomation.BE.Student;
import dk.GoldTeamRules.AttendanceAutomation.GUI.model.ClassroomModel;
import dk.GoldTeamRules.AttendanceAutomation.GUI.model.StudentModel;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
        tilePane.getChildren().addAll(createImageButtons(classroom));
    }

    private ArrayList<ImageView> createImageButtons(Classroom theClass)
    {
        ArrayList<ImageView> images = new ArrayList<>();

        for(Student s: students)
        {
            ImageView imageView = new ImageView();
            imageView.setImage(s.getStudentImage());
            imageView.setFitWidth(100);
            imageView.setFitHeight(100);
            imageView.setId(String.valueOf(s.getID()));
            imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    int imageID = Integer.parseInt(imageView.getId());
                    Student student = studentModel.matchStudentToPicture(imageID, students);
                    System.out.println(student);
                    CurrentStudent.clearCurrentStudent();
                    CurrentStudent.getInstance(student);
                    openConfirmation();
                }
            });
            images.add(imageView);
        }
        return images;
    }

    private void openConfirmation()
    {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/dk/GoldTeamRules/AttendanceAutomation/GUI/view/ConfirmAttendanceView.fxml"));
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Attendance Options");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}