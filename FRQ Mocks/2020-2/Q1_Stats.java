/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;

public class Q1_Stats {
    private ArrayList<Q1_ScoreInfo> scoreList;

    public boolean record(int score){
        //ArrayList<Q1_ScoreInfo> temp = new ArrayList<>(scoreList);  // copy arraylist
        for (Q1_ScoreInfo q1_scoreInfo : scoreList) {
            if (q1_scoreInfo.getScore() == score){
                q1_scoreInfo.increment();
                return false;
            }
        }
        scoreList.add(new Q1_ScoreInfo(score));
        return true;
    }

    public void recordScores(int[] stuScores){
        for (int stuScore : stuScores) {
            record(stuScore);
        }
    }

    /* C
    * We would need to add int instance variable called numSeniors which would
    * record many seniors received that relative score, similar to numStudents.
    * To get the percentage of seniors who got that score, we would write a
    * getSeniorPecrcent method that's public, returns a double, and takes nothing.
    * In that method we would calculate the number of students who got that score
    * (scoreObj.getScore()) divided by the number of seniors who  got that score,
    * (scoreObj.getNumSerniors(), which would be public accessor method that returned
    * the scoreObj's numSeniors instance variable value (int)) remembering to cast
    * double to either value to make sure we get decimal places.*/
}
