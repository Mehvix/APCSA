/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;

public class ClimbingClub {
    private ArrayList<ClimbInfo> climbList;

    public ClimbingClub() {
        climbList = new ArrayList<ClimbInfo>();
    }

    public void addClimb (String peakName, int climbTime){
        // Part B -- keep alphabetical
        for (int i = 0; i < climbList.size(); i++) {
            ClimbInfo climbInfo = climbList.get(i);
            if (climbInfo.getName().compareTo(peakName) < 0){
                climbList.add(i, new ClimbInfo(peakName, climbTime));
                return;
            }
        }
        // Part A
        climbList.add(new ClimbInfo(peakName, climbTime));
    }

    /*Part C
    * i. No
    * ii. Yes
    * */
}
