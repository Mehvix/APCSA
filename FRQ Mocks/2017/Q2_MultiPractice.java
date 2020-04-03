/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Q2_MultiPractice implements Q2_StudyPractice {
    private int a;
    private int b;

    public Q2_MultiPractice(int x, int y){
        a = x;
        b = y;
    }

    @Override
    public String getProblem() {
        return a + " TIMES " + b;
    }

    @Override
    public void nextProblem() {
        b ++;
    }

    public static void main(String[] args) {
        Q2_MultiPractice n = new Q2_MultiPractice(1, 3);
        System.out.println(n.getProblem());
        n.nextProblem();
        System.out.println(n.getProblem());
        n.nextProblem();
        n.nextProblem();
        System.out.println(n.getProblem());
    }
}
