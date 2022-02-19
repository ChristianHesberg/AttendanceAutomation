package dk.GoldTeamRules.AttendanceAutomation.BE;

import java.util.ArrayList;

public class Teacher {

    private String name;
    private int id;
    private ArrayList<Classroom> classes;

    public Teacher(String name, int id, ArrayList<Classroom> classes){
        this.name = name;
        this.id = id;
        this.classes = classes;
    }

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public int getId(){return id;}

    public void setId(){this.id = id;}

    public void setClasses(ArrayList<Classroom> classes){this.classes = classes;}

    public  ArrayList<Classroom> getClasses(){return classes;}

    @Override
    public String toString() {
        return name;
    }
}
