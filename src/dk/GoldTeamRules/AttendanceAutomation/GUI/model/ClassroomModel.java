package dk.GoldTeamRules.AttendanceAutomation.GUI.model;

import dk.GoldTeamRules.AttendanceAutomation.BE.Classroom;
import dk.GoldTeamRules.AttendanceAutomation.BE.Student;
import dk.GoldTeamRules.AttendanceAutomation.BLL.ClassroomLogic;
import dk.GoldTeamRules.AttendanceAutomation.util.CurrentStudent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ClassroomModel {

    private ClassroomLogic classroomLogic;
    private ObservableList<ImageView> imageViewObservableList;

    public ClassroomModel()
    {
        this.classroomLogic = new ClassroomLogic();
        this.imageViewObservableList = FXCollections.observableArrayList();

    }

    public ObservableList<ImageView> getImageViewObservableList() {
        return imageViewObservableList;
    }

    public Classroom getClassroom()
    {
        return classroomLogic.getClassroom();
    }

    public void createImageButtons(Classroom theClass)
    {
        ArrayList<ImageView> images = new ArrayList<>();
        ArrayList<Student> students = theClass.getStudents();

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
                    Student student = matchStudentToPicture(imageID, students);
                    System.out.println(student);
                    CurrentStudent.clearCurrentStudent();
                    CurrentStudent.getInstance(student);
                    openConfirmation();
                }
            });
            images.add(imageView);
        }
        imageViewObservableList.clear();
        imageViewObservableList.addAll(images);
        //return images;
    }

    private Student matchStudentToPicture(int imageID, ArrayList<Student> students)
    {
        for(Student s: students)
        {
            if (s.getID() == imageID)
            {
                return s;
            }
        }
        return null;
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
