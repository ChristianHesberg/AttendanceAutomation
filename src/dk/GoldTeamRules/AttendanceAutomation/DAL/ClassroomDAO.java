package dk.GoldTeamRules.AttendanceAutomation.DAL;

import dk.GoldTeamRules.AttendanceAutomation.BE.Classroom;
import dk.GoldTeamRules.AttendanceAutomation.BE.Student;
import dk.GoldTeamRules.AttendanceAutomation.BE.Teacher;
import javafx.scene.image.Image;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ClassroomDAO {
    Image studentImage = new Image("C:\\GitHub\\AttendanceAutomation\\src\\dk\\GoldTeamRules\\AttendanceAutomation\\GUI\\view\\thamm.png");

    public Classroom getClassroom()
    {
        ArrayList<Student> students = new ArrayList<>();
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
        ArrayList<Student> firstStudentList = new ArrayList<>();
        firstStudentList.add(new Student(studentImage, "bob", 1));
        firstStudentList.add(new Student(studentImage, "hamder", 9));
        firstStudentList.add(new Student(studentImage, "hancho", 10));
        ArrayList<Student> secondStudentList = new ArrayList<>();
        secondStudentList.add(new Student(studentImage, "font", 11));
        secondStudentList.add(new Student(studentImage, "bump", 12));
        secondStudentList.add(new Student(studentImage, "white", 13));

        ArrayList<Student> thirdStudentList = new ArrayList<>();
        thirdStudentList.add(new Student(studentImage, "red", 14));
        thirdStudentList.add(new Student(studentImage, "star", 15));
        thirdStudentList.add(new Student(studentImage, "botrher", 16));



        ArrayList<Classroom> classrooms = new ArrayList<>();

        Teacher teacher = new Teacher("Jeppe", 1, classrooms);

        classrooms.add(new Classroom("Math", teacher, firstStudentList));
        classrooms.add(new Classroom("Bio", teacher, secondStudentList));
        classrooms.add((new Classroom("Computer Science", teacher, thirdStudentList)));
        return classrooms;
    }

}
