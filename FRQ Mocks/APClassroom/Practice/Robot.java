/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Robot {
    private int[] hall;
    private int pos;
    private boolean facingRight;

    private boolean forwardMoveBlocked(){
        return ((facingRight && pos == hall.length-1) || (!facingRight && pos == 0));
    }

    private void move(){
        if (hall[pos] != 0) hall[pos] --;
        else {
            if (facingRight) pos++;
            else pos--;
        }
    }

    public int clearHall() {
        int cnt = 0;
        while(!hallIsClear()){
            if (forwardMoveBlocked()) facingRight = !facingRight;
            move();
            cnt ++;
        }
        return cnt;
    }

    private boolean hallIsClear(){
        for (int i : hall) {
            if (i != 0) return false;
        }
        return true;
    }
}
