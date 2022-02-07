package dk.GoldTeamRules.AttendanceAutomation.BLL;

import dk.GoldTeamRules.AttendanceAutomation.BE.Classroom;
import dk.GoldTeamRules.AttendanceAutomation.DAL.ClassroomDAO;

public class ClassroomLogic {

    private ClassroomDAO classroomDAO;

    public ClassroomLogic() {
        this.classroomDAO = new ClassroomDAO();
    }

    public Classroom getClassroom()
    {
        return classroomDAO.getClassroom();
    }

}
