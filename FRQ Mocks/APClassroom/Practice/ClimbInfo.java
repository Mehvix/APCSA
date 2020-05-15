/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class ClimbInfo {
    private String name;
    private int time;

    public ClimbInfo(String peakName, int climbTime){
        this.name = peakName;
        this.time = climbTime;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }
}
