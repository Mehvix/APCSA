/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Reservation {
    private String guestName;
    private int roomNumber;
    public Reservation(String guestName, int roomNumber){
        this.guestName = guestName;
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
