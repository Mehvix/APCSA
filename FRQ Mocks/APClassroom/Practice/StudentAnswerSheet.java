/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;

public class StudentAnswerSheet {
    public ArrayList<String> answers;

    public double getScore(ArrayList<String> key){
        double score = 0;
        for (int i = 0; i < key.size(); i++) {
            String keyItem = key.get(i);
            String stuItem = answers.get(i);
            if (stuItem.equals(keyItem)){
                score ++;
            } else if (!stuItem.equals("?")){
                score -= .25;
            }
        }
        return score;
    }

    public String getName(){
        return "name";
    }
}
