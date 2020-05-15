/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class HorseBarn {
    private Horse[] spaces;

    public int findHorseSpace(String name){
        for (int i = 0; i < spaces.length; i++) {
            Horse space = spaces[i];
            if (space != null && space.getName().equals(name)) return i;  // Correction: Added `space != null`
        }
        return -1;
    }

    public void consolidate(){
        for (int i = 0; i < spaces.length; i++) {
            Horse spaceI = spaces[i];
            if(spaceI.getName() == null) {
                for(int j = i+1; j < spaces.length; j++){
                    Horse spaceJ = spaces[j];
                    if(spaceJ != null){
                        spaces[i] = spaces[j];
                        spaces[j] = null;
                        break;
                    }
                }
            }
        }
    }
}
