/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class AirTravel {
    public static int milesTraveled(){
        return 1;
    }

//  A
    public static int totalPointsEarned(int numFlights){
        int miles = 0;
        for (int i = 0; i < numFlights; i++) {
            miles += milesTraveled();
        }

        int points = 0;
        if(miles > 10000){
            points += 1000;
            miles -= 1000;

            points += 2*9000;
            miles -= 9000;

            points += 5*miles;
            miles = 0;

        } else if (miles > 1000){
            points += 1000;
            miles -= 1000;

            points += 2*miles;
            miles = 0;

        } else {
            points += miles;
            miles = 0;
        }
        return points;
    }

    /*B
    * If we wanted to add a limit to how many points you could earn we would need a new integer instance variable called
    * pointLimit. We would also need a mutator method, something like public void setLimit(int newLimit), that would
    * take an integer value, newLimit, and set the pointLimit instance variable equal to it. Then, in the
    * totalPointsEarned method, after the points are calculated -- but before they're returned -- we'd add an if
    * statement. In this if statement we would check if the int variable points (variable representing how many points
    * earned so far) was greater than the instance variable pointLimit. If it was greater, we'd return pointLimit;
    * otherwise, we'd return the points variable
    */
}
