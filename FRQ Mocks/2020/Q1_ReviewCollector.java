/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.*;

public class Q1_ReviewCollector {
    private ArrayList<Q1_ProductReview> reviewList;
    private ArrayList<String> productList;

    public Q1_ReviewCollector(){
        reviewList = new ArrayList<Q1_ProductReview>();
        productList = new ArrayList<String>();
    }

    public void addReview(Q1_ProductReview prodReview){
        reviewList.add(prodReview);

        String name = prodReview.getName();
        boolean contains = false;
        for (String s : productList) {
            if (s.equals(name)){
                contains = true;
                break;
            }
        }

        if (!contains){
            productList.add(name);
        }
    }

    public int getNumGoodReviews(String prodName){
        int cnt = 0;
        for (Q1_ProductReview productReview : reviewList) {
            String name = productReview.getName();
            String review = productReview.getReview();
            if (prodName.equals(name)) {
                for (int i = 0; i < name.length() - 4; i++) {
                    if (review.charAt(i) == 'b' &&
                        review.charAt(i + 1) == 'e' &&
                        review.charAt(i + 2) == 's' &&
                        review.charAt(i + 3) == 't'){
                        cnt ++;
                    }
                }
            }
        }
        return cnt;
    }

    /* (c)
    -   Checks all product reviews in productList. Any that are good (have 'best' anywhere) are added to new
        ArrayList bestReviews
    -   1.) We would need another instance variable 'bestReviews' that is an ArrayList of Strings
        2.) We wouldn't need 'cnt', instead if we wanted how many good reviews we could return bestReviews.size();
    */

    public static void main(String[] args) {
        Q1_ReviewCollector a = new Q1_ReviewCollector();
        a.addReview(new Q1_ProductReview("entry1", "best"));
        a.addReview(new Q1_ProductReview("entry2", "e"));
        a.addReview(new Q1_ProductReview("entry3", "easldkj"));
        System.out.println(a.getNumGoodReviews("entry1"));
    }
}
