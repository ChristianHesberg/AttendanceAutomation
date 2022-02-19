package dk.GoldTeamRules.AttendanceAutomation.BLL;

import dk.GoldTeamRules.AttendanceAutomation.BE.Classroom;
import dk.GoldTeamRules.AttendanceAutomation.DAL.ClassroomDAO;

import java.util.ArrayList;

public class ClassroomLogic {

    private ClassroomDAO classroomDAO;

    public ClassroomLogic() {
        this.classroomDAO = new ClassroomDAO();
    }

    public Classroom getClassroom()
    {
        return classroomDAO.getClassroom();
    }

    public ArrayList<Classroom> getAllClassrooms()
    {
        return classroomDAO.getAllClassrooms();
    }

}
