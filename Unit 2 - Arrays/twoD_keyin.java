/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.Arrays;
import java.util.Scanner;

/*
Program: 2D array keyin

*/
public class twoD_keyin
{

    //print will format the values of a 2D string array into a String
    //@Param: String[][]
    //@Param: the output of the array as a String
    public static String print(String[][] a)
    {
        // create a variable to store the String for the output
        String output = "";  //initialize to blank
        //go thru all of the rows
        for(int row = 0; row < a.length; row++)
        {
            //now go thru all of the columns
            for(int column = 0; column <  a[0].length; column++) //note: a[0] is the 0th row of the array
            {
                // put the value of the array at the row,column position into the output stream
                output += a[row][column] + " "; //and add on a little space between each value
            }
            // at the very end of the column count, put a new line in the output stream before going on to the next row
            output += '\n';
        }

        //return the output to the place where the call is made
        return output;
    }


    // the main method of the program runs everything
    public static void main(String[] args)
    {
        // create a 2D array to store names of colors in
        String[][] color = {{"blue","green","purple"},{"red","brown","orange"},{"yellow","white","black"}, {"pink","teal","gold"}};


    }

    public static int readValidInt(int row, int col){
        System.out.println("What int value would you like at row " + row + " and col " + col);
        Scanner in = new Scanner(System.in);
        int value;
        if (in.hasNextInt()) {  // if user inputs an int
            value = in.nextInt();
            return value;
        } else {  // if user DOESN'T input an int
            return readValidInt(row, col);
        }
    }
    public static void fillArray(int[][] a)
    {
        for (int row = 0; row < a.length; row ++){
            // int[] current_row = a[row];
            for (int col = 0; col < a[0].length; col ++){
                {
                    a[row][col] = readValidInt(row, col);
                }
            }
        }
    }
}

/*
1. What value is in the 2nd row the 0th color 2D array? Print it out and see if you are correct, by
typing in System.out.println(color[2][0]).
yellow

2.  What are the values of the 0th column of the 2D array?
blue, red, yellow, pink

3. print out the 2D array of colors (hint: use the print method created in this program!)
Arrays.deepToString(color)

OR

for (String[] i : color){
    for (String j : i){
        System.out.print(j + ", ");
    }
    System.out.println("");
};

4.  If I have a 2D array that is 5X3 like this:
* * *
* * *
* * *
* * *
* * *
What is the length of the 0th row?
3
What is the length of the 3rd row?
3
How does the length of a row relate to the number of columns?
Len of row is constant and doesn't change

5.  Create a new 2D array of Integer values called numbers that has 5 rows and 3 columns
int[][] intArr = new int[5][3];

6.  Write a method called fillArray that will take a 2D int array and fill it with values supplied by the user.
The header for this method should look like this:
public static int readValidInt(int row, int col){
    System.out.println("What int value would you like at row " + row + " and col " + col);
    Scanner in = new Scanner(System.in);
    int value;
    if (in.hasNextInt()) {  // if user inputs an int
        value = in.nextInt();
        return value;
    } else {  // if user DOESN'T input an int
        return readValidInt(row, col);
    }
}
public static void fillArray(int[][] a)
{
    for (int row = 0; row < a.length; row ++){
        // int[] current_row = a[row];
        for (int col = 0; col < a[0].length; col ++){
            {
                a[row][col] = readValidInt(row, col);
            }
        }
    }
}

7. Test your fillArray method by creating another (overloaded) print method that takes an int array instead of a String array.

Arrays.deepToString(intArr)

OR

for (int[] i : color){
    for (int j : i){
        System.out.print(j + ", ");
    }
    System.out.println("");
};



*/
