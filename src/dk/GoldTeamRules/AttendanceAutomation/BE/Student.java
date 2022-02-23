package dk.GoldTeamRules.AttendanceAutomation.BE;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class Student {

    private Image studentImage;
    private String name;
    private int ID;
    private ArrayList<Classroom> classes;
    private double absence;

    public Student(Image studentImage, String name, int ID) {
        this.studentImage = studentImage;
        this.name = name;
        this.ID = ID;
    }

    public Student(Image studentImage, String name, int ID, double absence) {
        this.studentImage = studentImage;
        this.name = name;
        this.ID = ID;
        this.absence = absence;
    }

    public double getAbsence() {
        return absence;
    }

    public void setAbsence(double absence) {
        this.absence = absence;
    }

    public Image getStudentImage() {
        return studentImage;
    }

    public void setStudentImage(Image studentImage) {
        this.studentImage = studentImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return name;
    }
}
