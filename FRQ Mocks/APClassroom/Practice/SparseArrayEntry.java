/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class SparseArrayEntry {
    private int row;
    private int col;
    private int value;

    public SparseArrayEntry(int r, int c, int v){
        row = r;
        col = c;
        value = v;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getValue() {
        return value;
    }
}
