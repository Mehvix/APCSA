/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;
import java.util.List;

public class SparseArray {
    private int numRows;
    private int numCols;
    private List<SparseArrayEntry> entries;

    public SparseArray(){
        entries = new ArrayList<SparseArrayEntry>();
    }

    public int getNumCols() {
        return numCols;
    }

    public int getNumRows() {
        return numRows;
    }

    public int getValueAt(int row, int col){
        for (SparseArrayEntry entry : entries) {
            if (entry.getCol() == col && entry.getRow() == row) return entry.getValue();
        }

        return 0;
    }

    public void removeColumn(int col) {
        ArrayList<SparseArrayEntry> tmp = new ArrayList<>();
        for (SparseArrayEntry entry : entries) {
            if (entry.getCol() < col){
                tmp.add(entry);
            } else if (entry.getCol() > col){
                tmp.add(new SparseArrayEntry(entry.getRow(), entry.getCol() - 1, entry.getValue()));
            }
        }
        entries = tmp;
        numCols --;  // Correction: Forgot this
    }
}
