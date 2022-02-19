package dk.GoldTeamRules.AttendanceAutomation.BE;

import java.util.ArrayList;

public class Attendance {
    private Classroom classroom;
    private Student student;
    private float point;

    public Attendance(Classroom classroom, Student student, float point){
        this.classroom = classroom;
        this.point = point;
        this.student = student;
    }
    public Attendance(Classroom classroom, float point){
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
