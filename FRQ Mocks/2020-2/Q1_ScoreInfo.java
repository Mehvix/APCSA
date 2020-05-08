/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Q1_ScoreInfo {
    private int score;
    private int numStudents;

    public Q1_ScoreInfo(int aScore){
        score = aScore;
        numStudents = 1;
    }

    public void increment(){
        numStudents++;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public int getScore() {
        return score;
    }
}
