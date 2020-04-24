/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */
import java.util.*;

public class Q3_SparseArray {

	 /** The number of rows and columns in the sparse array. */
	private int numRows;
	 private int numCols;

	/** The list of entries representing the non-zero elements of the sparse array. Entries are stored in the*
     * list in no particular order. Each non-zero element is represented by exactly one entry in the list.
	*/
	private List<Q3_SparseArrayEntry> entries;

	/** Constructs an empty SparseArray. */
	public Q3_SparseArray(){
	    entries = new ArrayList<Q3_SparseArrayEntry>();
	}

	/** Returns the number of rows in the sparse array. */
	public int getNumRows()	{  return numRows;  }

	/** Returns the number of columns in the sparse array. */
	public int getNumCols()	{  return numCols;  }

	/** Returns the value of the element at row index row and column index col in the sparse array.*
     * Precondition:  0  row < getNumRows()
	*0  col < getNumCols()
	*/
	public int getValueAt(int row, int col)	{
        for (Q3_SparseArrayEntry entry : entries) {
            if (entry.getCol() == col && entry.getRow() == row){
                return entry.getValue();
            }
        }
        return 0;
	}

	/** Removes the column col from the sparse array. *Precondition:  0  col < getNumCols()
	*/
	public void removeColumn(int col) {
        for (Q3_SparseArrayEntry entry : entries) {
            ArrayList<Q3_SparseArrayEntry> temp = new ArrayList<>();

            if (entry.getCol() < col){
                temp.add(entry);
            } else if (entry.getCol() > col){
                temp.add(new Q3_SparseArrayEntry(entry.getRow(), entry.getCol() - 1, entry.getValue()));
            }
        }
	}

	// There may be instance variables, constructors, and methods that are not shown.
}
