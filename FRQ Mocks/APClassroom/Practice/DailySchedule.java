/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;

public class DailySchedule {
    private ArrayList<Appointment> apptList;

    public DailySchedule(){
        apptList = new ArrayList();
    }

    public void clearConflicts(Appointment appt){
        ArrayList<Appointment> tmp = new ArrayList<>();
        for (Appointment appointment : apptList) {
            if(!appointment.conflictsWith(appt)) tmp.add(appointment);
        }
        apptList = tmp;
    }

    public boolean addAppt (Appointment appt, boolean emergency){
        if(emergency){
            clearConflicts(appt);
        } else {
            for (Appointment appointment : apptList) {
                if (appt.conflictsWith(appointment)){
                    return false;
                }
            }
        }
        apptList.add(appt);
        return true;
    }
}
