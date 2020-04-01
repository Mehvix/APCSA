/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: 2/13/20
 * Purpose: Test Hamburger.java
 */



public class hamburgerTest {
    public static void main(String[] args) {
        Hamburger ham1 = new Hamburger(700);
        Hamburger ham2 = new Hamburger(4.99);
        String[] comp = {"Bun", "Onion", "Pickle", "Cheese", "Patty", "Bun"};
        Hamburger ham3 = new Hamburger(comp);


        ham1.write(3.75);
        System.out.println("First hamburger: " + ham1.toString() + "\n");
        System.out.println("Second hamburger: " + ham2.toString() + "\n");
        System.out.println("Third hamburger: " + ham3.toString() + "\n");

        Hamburger.write_static("Canada");
        String[] new_comp = {"Bun", "Patty", "Patty", "Patty", "Bun"};
        ham3.write(new_comp);
        ham3.write(3);

        System.out.println("First hamburger: " + ham1.toString() + "\n");
        System.out.println("The second hambruger's calorie count is " + ham2.read("calories"));
        System.out.println("The third hambruger's store is " + ham3.read("store"));

        System.out.println("\nHamburger 1 and 2 are the same: " + ham1.equals(ham2));
        System.out.println("Hamburger 1 and 1 are the same: " + ham1.equals(ham1));
    }
}
