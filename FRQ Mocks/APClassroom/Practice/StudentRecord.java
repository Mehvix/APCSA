/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class StudentRecord {
    private int[] scores;

    private double average(int first, int last){
        int cnt = 0;
        for (int i = first; i < last; i++) {
            cnt += scores[i];
        }
        return (double)cnt/(last-first);
    }

    public boolean hasImproved(){
        for (int i = 0; i < scores.length-1; i++) {
            int score1 = scores[i];
            int score2 = scores[i+1];
            if(score1 > score2) return false;
        }
        return true;
    }

    public double finalAverage(){
        if(hasImproved()){
            return average(scores.length/2, scores.length);
        } else {
            return average(0, scores.length);
        }
    }
}
