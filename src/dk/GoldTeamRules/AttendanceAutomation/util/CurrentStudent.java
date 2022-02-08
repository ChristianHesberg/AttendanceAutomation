package dk.GoldTeamRules.AttendanceAutomation.util;

import dk.GoldTeamRules.AttendanceAutomation.BE.Student;

public class CurrentStudent {

    private static CurrentStudent instance;
    private Student currentStudent;

    private CurrentStudent(Student student)
    {
        this.currentStudent = student;
    }

    public static CurrentStudent getInstance(Student student)
    {
        if(instance==null)
        {
            instance = new CurrentStudent(student);
        }
        return instance;
    }

    public static void clearCurrentStudent()
    {
        instance = null;
    }

    public Student getCurrentStudent() {
        return currentStudent;
    }
}
