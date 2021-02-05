/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;

public class StudentAssignments {
    private ArrayList<Assignment> assignmentList;

//   A
    public int getNumberOfAs(String cat){
        int cnt = 0;

        for (Assignment assignment : assignmentList) {
            if (assignment.getCategory().equals(cat) && assignment.getGrade() >= 90){
                cnt ++;
            }
        }

        return cnt;
    }

//   B
    public void updateGrade(String cat){
        if (getNumberOfAs(cat) > 5){
            for (Assignment assignment : assignmentList) {
                if (assignment.getCategory().equals(cat) && assignment.getGrade() < 70){
                    assignment.setGrade(70);
                    break;
                }
            }
        }
    }

    /* C
    * -The method header for getAllGroupAssignments in the StudentAssignment class would be:
    * public List<Assignment> getAllGroupAssignments()
    * - We would need to add new boolean instance variable in the Assignment class called isGroupAssignment
    * - The instance variable would be true if the assignment was group, false if otherwise
    * - We would need to add a new accessor to return the status of isGroupAssignment. This method header would be
    * public boolean getGroupAssignmentStatus()
    * - In the getAllGroupAssignments we would interate through the assignmentList and keep track of how many Assignment
    * objects were group assignments via the getGroupAssignmentStatus. If a assignment was a group assignment, we'd add
    * 1 to a int variable called count (initialized before the iterative-loop as 0). This would keep track of how many
    * Group Assignments there are, so we'd return count at the end.
    */
}
