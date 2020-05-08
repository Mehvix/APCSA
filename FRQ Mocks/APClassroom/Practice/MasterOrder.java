/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.*;
import java.util.List;

public class MasterOrder {
    private List<CookieOrder> orders;

    public MasterOrder(){
        orders = new ArrayList<CookieOrder>();
    }

    public void addOrder(CookieOrder theOrder){
        orders.add(theOrder);
    }

    public int getTotalBoxes(){
        int cnt = 0;
        for (CookieOrder cookieOrder : orders) {
            cnt += cookieOrder.getNumBoxes();
        }
        return cnt;
    }

    public int removeVariety(String cookieVar){
        List<CookieOrder> temp = new ArrayList<>();
        int cnt = 0;
        for (CookieOrder order : orders) {
            if (!order.getVariety().equals(cookieVar)){
                temp.add(order);
            } else {
                cnt += order.getNumBoxes();
            }
        }
        orders = temp;
        return cnt;
    }
}
