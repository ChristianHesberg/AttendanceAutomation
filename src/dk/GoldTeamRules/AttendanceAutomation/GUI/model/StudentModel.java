package dk.GoldTeamRules.AttendanceAutomation.GUI.model;

import dk.GoldTeamRules.AttendanceAutomation.BE.Student;

import java.util.ArrayList;

public class StudentModel {

    public Student matchStudentToPicture(int imageID, ArrayList<Student> students)
    {
        for(Student s: students)
        {
            if (s.getID() == imageID)
            {
                return s;
            }
        }
        return null;
    }

    public void registerAttendance()
    {

    }

}
