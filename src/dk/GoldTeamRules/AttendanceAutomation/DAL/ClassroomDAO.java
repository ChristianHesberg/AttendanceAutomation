package dk.GoldTeamRules.AttendanceAutomation.DAL;

import dk.GoldTeamRules.AttendanceAutomation.BE.Classroom;
import dk.GoldTeamRules.AttendanceAutomation.BE.Student;
import dk.GoldTeamRules.AttendanceAutomation.BE.Teacher;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class ClassroomDAO {

    public Classroom getClassroom()
    {
        ArrayList<Student> students = new ArrayList<>();
        Image studentImage = new Image("C:\\GitHub\\AttendanceAutomation\\src\\dk\\GoldTeamRules\\AttendanceAutomation\\GUI\\view\\thamm.png");
        students.add(new Student(studentImage, "bob"));
        students.add(new Student(studentImage, "fred"));
        students.add(new Student(studentImage, "bob"));
        students.add(new Student(studentImage, "fred"));
        return new Classroom("CS", students);
    }

}
