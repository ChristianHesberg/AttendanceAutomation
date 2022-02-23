package dk.GoldTeamRules.AttendanceAutomation.DAL;

import dk.GoldTeamRules.AttendanceAutomation.BE.Classroom;
import dk.GoldTeamRules.AttendanceAutomation.BE.Student;
import dk.GoldTeamRules.AttendanceAutomation.BE.Teacher;
import javafx.scene.image.Image;
import java.util.ArrayList;

public class ClassroomDAO {
    Image studentImage = new Image("PlaceholderProfile.png");


    public ArrayList<Classroom> getAllClassrooms()
    {
        ArrayList<Student> zeroStudentList = new ArrayList<>();
        zeroStudentList.add(new Student(studentImage, "bob", 1, .042));
        zeroStudentList.add(new Student(studentImage, "fred", 2, .042));
        zeroStudentList.add(new Student(studentImage, "john",3 , .042));
        zeroStudentList.add(new Student(studentImage, "joe", 4, .042));
        zeroStudentList.add(new Student(studentImage, "hendrix",5 , .042));
        zeroStudentList.add(new Student(studentImage, "bowie",6, .042));
        zeroStudentList.add(new Student(studentImage, "clapton",7, .042));
        zeroStudentList.add(new Student(studentImage, "page",8, .042));

        ArrayList<Student> firstStudentList = new ArrayList<>();
        firstStudentList.add(new Student(studentImage, "bob", 1, .042));
        firstStudentList.add(new Student(studentImage, "hamder", 9, .042));
        firstStudentList.add(new Student(studentImage, "hancho", 10, .042));

        ArrayList<Student> secondStudentList = new ArrayList<>();
        secondStudentList.add(new Student(studentImage, "font", 11, .042));
        secondStudentList.add(new Student(studentImage, "bump", 12, .042));
        secondStudentList.add(new Student(studentImage, "white", 13, .042));

        ArrayList<Student> thirdStudentList = new ArrayList<>();
        thirdStudentList.add(new Student(studentImage, "red", 14, .042));
        thirdStudentList.add(new Student(studentImage, "star", 15, .042));
        thirdStudentList.add(new Student(studentImage, "botrher", 16, .042));



        ArrayList<Classroom> classrooms = new ArrayList<>();

        Teacher teacher = new Teacher("Jeppe", 1, classrooms);

        classrooms.add(new Classroom("ITO", teacher, zeroStudentList));
        classrooms.add(new Classroom("Math", teacher, firstStudentList));
        classrooms.add(new Classroom("Bio", teacher, secondStudentList));
        classrooms.add((new Classroom("Computer Science", teacher, thirdStudentList)));
        return classrooms;
    }

}
