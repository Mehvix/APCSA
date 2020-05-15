/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;

public class Trip {
    private ArrayList<Flight> flights;

    public int getDuration(){
        if(flights.isEmpty()) return 0;
        return flights.get(0).getArrivalTime().minutesUntil(flights.get(flights.size()-1).getDepartureTime());
    }

    public int getShortestLayover(){
        if (flights.size() < 2) return -1; //Correction: added this for edgecase

        int min = Integer.MAX_VALUE;  // Correction: Should be getDuration() instead
        for (int i = 0; i < flights.size()-1; i++) {
            Flight flight1 = flights.get(i);
            Flight flight2 = flights.get(i+1);

            min = Math.min(min, flight1.getArrivalTime().minutesUntil(flight2.getDepartureTime()));
        }
        return min;
    }
}
