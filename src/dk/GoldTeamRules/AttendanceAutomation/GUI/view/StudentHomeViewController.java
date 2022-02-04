package dk.GoldTeamRules.AttendanceAutomation.GUI.view;

import dk.GoldTeamRules.AttendanceAutomation.BE.Classroom;
import dk.GoldTeamRules.AttendanceAutomation.BE.Student;
import dk.GoldTeamRules.AttendanceAutomation.BLL.ClassroomLogic;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class StudentHomeViewController implements Initializable {

    private ClassroomLogic classroomLogic;

    @FXML
    public TilePane tilePane;
    @FXML
    private BorderPane borderPane;

    public StudentHomeViewController() {
        this.classroomLogic =  new ClassroomLogic();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /*Image image = new Image("C:\\GitHub\\AttendanceAutomation\\src\\dk\\GoldTeamRules\\AttendanceAutomation\\GUI\\view\\thamm.png");
        ImageView iv1 = new ImageView(image);
        iv1.setFitHeight(100);
        iv1.setFitWidth(100);
        iv1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("whoop");
            }
        });

         */
        tilePane.getChildren().addAll(createImageButtons(classroomLogic.getClassroom()));
    }

    public ArrayList<ImageView> createImageButtons(Classroom theClass)
    {
        ArrayList<Student> students = theClass.getStudents();
        ArrayList<ImageView> images = new ArrayList<>();

        for(Student s: students)
        {
            ImageView imageView = new ImageView();
            imageView.setImage(s.getStudentImage());
            imageView.setFitWidth(100);
            imageView.setFitHeight(100);
            imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    System.out.println("whoop");
                }
            });
            images.add(imageView);
        }
        return images;
    }

}