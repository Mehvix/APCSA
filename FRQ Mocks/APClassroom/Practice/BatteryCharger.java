/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class BatteryCharger {
    private int[] rateTable;

    private int getChargingCost(int startHour, int chargeTime){
        int cst = 0;
        for (int i = startHour; i < startHour+chargeTime; i++) {
            cst += rateTable[i%24];
        }
        return cst;
    }

    public static int getChargeStartTime(int chargeTime){
        int start = 0;
        BatteryCharger bc = new BatteryCharger();
        for (int i = 1; i < 24; i++) {
            if(bc.getChargingCost(start, chargeTime) < bc.getChargingCost(i, chargeTime)){
                start = i;
            }
        }
        return start;
    }
}
