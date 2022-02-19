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
        students.add(new Student(studentImage, "bob", 1));
        students.add(new Student(studentImage, "fred", 2));
        students.add(new Student(studentImage, "john",3 ));
        students.add(new Student(studentImage, "joe", 4));
        students.add(new Student(studentImage, "hendrix",5 ));
        students.add(new Student(studentImage, "bowie",6));
        students.add(new Student(studentImage, "clapton",7));
        students.add(new Student(studentImage, "page",8));
        return new Classroom("CS", students);
    }

    public ArrayList<Classroom> getAllClassrooms()
    {
        ArrayList<Student> emptyStudentList = new ArrayList<>();
        ArrayList<Classroom> classrooms = new ArrayList<>();

        Teacher teacher = new Teacher("Jeppe", 1, classrooms);

        classrooms.add(new Classroom("Math", teacher, emptyStudentList));
        classrooms.add(new Classroom("Bio", teacher, emptyStudentList));
        classrooms.add((new Classroom("Computer Science", teacher, emptyStudentList)));
        return classrooms;
    }

}
