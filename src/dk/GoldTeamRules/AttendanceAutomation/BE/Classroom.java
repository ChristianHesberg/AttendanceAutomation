package dk.GoldTeamRules.AttendanceAutomation.BE;


import java.util.ArrayList;

public class Classroom {

    private String name;
    private ArrayList<Student> students;
    private Teacher teacher;

    public Classroom(String name, Teacher teacher, ArrayList<Student> students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public Classroom(String name, ArrayList<Student> students)
    {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
