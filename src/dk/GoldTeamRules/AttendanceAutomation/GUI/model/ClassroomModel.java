package dk.GoldTeamRules.AttendanceAutomation.GUI.model;

import dk.GoldTeamRules.AttendanceAutomation.BE.Classroom;
import dk.GoldTeamRules.AttendanceAutomation.BLL.ClassroomLogic;

public class ClassroomModel {

    private ClassroomLogic classroomLogic;

    public ClassroomModel()
    {
        this.classroomLogic = new ClassroomLogic();
    }

    public Classroom getClassroom()
    {
        return classroomLogic.getClassroom();
    }

}
