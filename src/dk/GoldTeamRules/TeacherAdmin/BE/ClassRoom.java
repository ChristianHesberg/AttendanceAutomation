package dk.GoldTeamRules.TeacherAdmin.BE;

import dk.GoldTeamRules.AttendanceAutomation.BE.Student;

import java.util.ArrayList;

public class ClassRoom {

    String classRoomName;
    int classID;

    public ClassRoom(String classRoomName, int classID, ArrayList<Student> students) {
        this.classRoomName = classRoomName;
        this.classID = classID;
        this.students = students;
    }

    public String getClassRoomName() {
        return classRoomName;
    }

    public void setClassRoomName(String classRoomName) {
        this.classRoomName = classRoomName;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    private ArrayList<Student> students;

}
