/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;

public class TileGame {
    private ArrayList<NumberTile> board;

    public TileGame(){
        board = new ArrayList<NumberTile>();
    }

    private int getIndexForFit(NumberTile tile){
        if(board.isEmpty()) return 0;
        if(board.get(0).getLeft() == tile.getRight()){
            return 1;
        }
        if(board.get(board.size()-1).getRight() == tile.getLeft()){
            return board.size()-1;  // Correction: Doesn't need -1
        }

        for (int i = 0; i < board.size()-1; i++) {
            NumberTile numberTile1 = board.get(i);
            NumberTile numberTile2 = board.get(i+1);
            if(numberTile1.getRight() == tile.getLeft() && numberTile2.getLeft() == tile.getRight()){
                return i;
            }
        }
        return -1;
    }

    public boolean insertTile(NumberTile tile){
        for (int i = 0; i < 4; i++) {
            if (getIndexForFit(tile) != -1) {
                board.add(getIndexForFit(tile), tile); // Correction: Needed to add this
                return true;
            }
            tile.rotate();
        }
        return false;
    }
}
