/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */


import java.util.List;

public class FuelDepot {
    private FuelRobot filler;

    private List<FuelTank> tanks;

    public int nextTankToFill(int threshold){
        int minVal = Integer.MAX_VALUE;
        int minIdx = filler.getCurrentIndex();
        for (int i = 0; i < tanks.size(); i++) {
            FuelTank fuelTank = tanks.get(i);
            int level = fuelTank.getFuelLevel();
            if(level < minVal && level < threshold){
                minIdx = i;
                minVal = level;
            }
        }
        return minIdx;
    }

    public void moveToLocation(int locIndex){
        if (locIndex != filler.getCurrentIndex()) {
            if (locIndex > filler.getCurrentIndex()){
                if(!filler.isFacingRight()) filler.changeDirection();
                filler.moveForward(locIndex-filler.getCurrentIndex());
            } else {
                if(filler.isFacingRight()) filler.changeDirection();
                filler.moveForward(filler.getCurrentIndex()-locIndex);
            }
        }
    }
}
