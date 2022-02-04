package dk.GoldTeamRules.AttendanceAutomation.BE;

import javafx.scene.image.Image;

public class Student {

    private Image studentImage;
    private String name;

    public Student(Image studentImage, String name) {
        this.studentImage = studentImage;
        this.name = name;
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
}
