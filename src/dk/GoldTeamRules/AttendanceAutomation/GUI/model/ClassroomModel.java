package dk.GoldTeamRules.AttendanceAutomation.GUI.model;

import dk.GoldTeamRules.AttendanceAutomation.BE.Classroom;
import dk.GoldTeamRules.AttendanceAutomation.BE.Student;
import dk.GoldTeamRules.AttendanceAutomation.BLL.ClassroomLogic;
import dk.GoldTeamRules.AttendanceAutomation.util.CurrentStudent;
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

    public ClassroomModel()
    {
        this.classroomLogic = new ClassroomLogic();
    }

    public ArrayList<Classroom> getAllClassrooms()
    {
        return classroomLogic.getAllClassrooms();
    }

    public ArrayList<ImageView> createImageButtons(ArrayList<Student> students)
    {
        ArrayList<ImageView> images = new ArrayList<>();

        for(Student s: students)
        {
            ImageView imageView = new ImageView();
            imageView.setImage(s.getStudentImage());
            imageView.setFitWidth(100);
            imageView.setFitHeight(100);
            imageView.setId(String.valueOf(s.getID()));
            imageView.getStyleClass().add("profilePic");
            imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    int imageID = Integer.parseInt(imageView.getId());
                    Student student = matchStudentToPicture(imageID, students);
                    System.out.println(student);
                    CurrentStudent.clearCurrentStudent();
                    CurrentStudent.getInstance(student);
                    openConfirmation();
                    //imageView.setVisible(false);
                    //imageView.setManaged(false);
                }
            });
            images.add(imageView);
        }
        return images;
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
