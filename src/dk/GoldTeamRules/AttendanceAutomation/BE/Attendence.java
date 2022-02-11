package dk.GoldTeamRules.AttendanceAutomation.BE;

import java.util.ArrayList;

public class Attendence {
    private Classroom classroom;
    private Student student;
    private float point;

    public Attendence(Classroom classroom, Student student, float point){
        this.classroom = classroom;
        this.point = point;
        this.student = student;
    }
    public Attendence(Classroom classroom, float point){
        this.classroom = classroom;
        this.point = point;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public Student getStudent() {
        return student;
    }

    public float getPoint() {
        return point;
    }
}
