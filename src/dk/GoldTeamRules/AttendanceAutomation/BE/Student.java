package dk.GoldTeamRules.AttendanceAutomation.BE;

import javafx.scene.image.Image;

public class Student {

    private Image studentImage;
    private String name;
    private int ID;

    public Student(Image studentImage, String name, int ID) {
        this.studentImage = studentImage;
        this.name = name;
        this.ID = ID;
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
