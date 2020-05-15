/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;

public class Hotel {
    private Reservation[] rooms;
    private ArrayList waitList;

    public Reservation requestRoom (String guestName){
        for (int i = 0; i < rooms.length; i++) {
            Reservation room = rooms[i];
            if (room == null){
                Reservation newRes = new Reservation(guestName, i);
                rooms[i] = newRes;
                return newRes;
            }
        }
        waitList.add(guestName);
        return null;
    }

    public Reservation cancelAndReassign(Reservation res){
        int roomI = res.getRoomNumber();
        if(!waitList.isEmpty()){
            Reservation newRes = new Reservation((String) waitList.get(0), roomI);
            rooms[roomI] = newRes;
            waitList.remove(0);
            return newRes;
        } else {
            rooms[roomI] = null;
            return null;
        }
    }
}
