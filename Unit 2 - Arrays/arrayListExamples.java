import java.util.*; //to use ArrayLists!

public class arrayListExamples
{
   public static void main(String[] args)
   {
      // you can create an arrayList of any datatype! Here are a few examples
      ArrayList<Integer> myNumberList = new ArrayList<Integer>();
      ArrayList<Card> standardDeck = new ArrayList<Card>(52);
      ArrayList<String> wordList = new ArrayList<String>();
      
      //test out add, remove, set, and the other add methods from the ArrayList Class
      // You can append values to the ArrayList, by using the add method like this:
      myNumberList.add(16);
      myNumberList.add(28);
      myNumberList.add(12);
      myNumberList.add(54);    
      System.out.println(myNumberList);
      
      //using add with 2 parameters adds the element (2nd parameter) at the specified index (1st parameter) spot
      myNumberList.add(1, 99);
      myNumberList.add(150);
      System.out.println(myNumberList);
      
      // the set method sets the specified index to the specified value
      myNumberList.set(3, 345);
      System.out.println(myNumberList);


      // to get a specific element from an ArrayList:
      myNumberList.get(4); //this will get the 4th element of the list and return it, if you want to see it:
      System.out.println("The 5th element in the list is "+myNumberList.get(4));
   
      //test out the shuffle and sort methods from the Collections class :)
      Collections.sort(myNumberList);
      System.out.println(myNumberList);
      
      Collections.shuffle(myNumberList);
      System.out.println(myNumberList);  
   }
}