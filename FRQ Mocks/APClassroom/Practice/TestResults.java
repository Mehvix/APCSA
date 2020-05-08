/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;

public class TestResults {
    private ArrayList<StudentAnswerSheet> sheets;

    public String highestScoringStudent (ArrayList<String> key){
        int high = Integer.MIN_VALUE;
        String name = "";
        for (StudentAnswerSheet student : sheets) {
            if (student.getScore(key) > high) {
                name = student.getName();
            }
        }
        return name;
    }
}
