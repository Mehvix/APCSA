/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;

public class OnlinePurchaseManager {
    private ArrayList<Gizmo> purchases;

    public OnlinePurchaseManager(ArrayList<Gizmo> purchases) {
        this.purchases = purchases;
    }

    public int countElectronicsByMaker(String maker){
        int cnt = 0;
        for (Gizmo purchase : purchases) {
            if (purchase.isElectronic() && purchase.getMaker().equals(maker)){
                cnt ++;
            }
        }

        return cnt;
    }

    public boolean hasAdjacentEqualPair(){
        for (int i = 0; i < purchases.size() - 1; i++) {
            Gizmo gizmo1 =  purchases.get(i);
            Gizmo gizmo2 =  purchases.get(i+1);

            if(gizmo1.equals(gizmo2)){
                return true;
            }
        }
        return false;
    }

    /*C
    * - public Gizmo getCheapestGizmoByMaker(String company)
    * - We would need to include new instance variable, int cost, in the Gizmo class
    * - We would need to add accessor method public int getCost() that would return the the private cost variable in the
    * Gizmo class
    * - We would iterate through the purchases ArrayList and keep track of the lowest price using a new int variable low.
    * - If the Gizmo object was made by the company -- Gizmo.getMaker().equals(company) -- and the price lower than the
    * min -- Gizmo.getCost() < low -- then we'd update low to equal the Gizmo's cost -- low = Gizmo.getCost()
    * */
}
