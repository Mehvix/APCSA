/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: 2/13/20
 * Purpose: hamburger
 */



public class Hamburger {
    /** Hamburger
     * This class manages the hamburger object
     * A hamburger can be constructed with calories, cost, and composition, e.g.:
     * Hamburger x = new Hamburger([calories], [cost], [composition])
     */

    // declare instance variables
    private int calories;
    private double cost;
    private String[] composition;
    private static String origin;

    // defaults
    private final int DEFAULT_CALORIES = 500;
    private final double DEFAULT_COST = 5.99;
    private final String[] DEFAULT_COMPOSITION = {"Bun", "Patty", "Bun"};
    private final String DEFAULT_ORIGIN = "United States";

    //make constructor
    public Hamburger() {
        // initialize values for instance variables
        calories = DEFAULT_CALORIES;
        cost = DEFAULT_COST;
        composition = DEFAULT_COMPOSITION;
        origin = DEFAULT_ORIGIN;
    }
    public Hamburger(int i) {
        // initialize values for instance variables
        calories = i;
        cost = DEFAULT_COST;
        composition = DEFAULT_COMPOSITION;
        origin = DEFAULT_ORIGIN;
    }
    public Hamburger(double d) {
        // initialize values for instance variables
        calories = DEFAULT_CALORIES;
        cost = d;
        composition = DEFAULT_COMPOSITION;
        origin = DEFAULT_ORIGIN;
    }
    public Hamburger(String[] strlist) {
        // initialize values for instance variables
        calories = DEFAULT_CALORIES;
        cost = DEFAULT_COST;
        composition = strlist;
        origin = DEFAULT_ORIGIN;
    }
    public Hamburger(String str) {
        // initialize values for instance variables
        calories = DEFAULT_CALORIES;
        cost = DEFAULT_COST;
        composition = DEFAULT_COMPOSITION;
        origin = str;
    }

    // mutator method -- allow others to write to private instance variable values
    public void write(int i) {
        calories = i;
    }

    public void write(double d) {
        cost = d;
    }

    public void write(String[] strlist) {
        composition = strlist;
    }

    // this is a static method, if i change the variable for 1 obj, it changes for all. When I call on this method, I will call on it with the nam eof the class (Hamburger) instead of the name of the object
    public static void write_static(String str){
        origin = str;
    }

    // accessor method -- allow others to read private instance variable values
    public String read(String arg) {
        switch (arg) {
            case "calories":
                return Integer.toString(calories);
            case "cost":
                return Double.toString(cost);
            case "composition":
                return String.join(", ", composition);
            case "origin":
                return origin;
        }
        return "INVALID ARG";
    }

    // regular method
    public String toString() {
        return "Calories: " + calories +
                "\nCost: $" + cost +
                "\nComposition"+ String.join(", ", composition) +
                "\nOrigin: " + origin;
    }

    public boolean equals(Object ham) {
        return (this == ham);
    }
}
