/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Appointment {
    private TimeInterval time;
    public TimeInterval getTime(){
        return time;
    }

    public boolean conflictsWith(Appointment other){
        return other.getTime().overlapWith(this.getTime());
    }
}
