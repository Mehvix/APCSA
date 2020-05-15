/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Customer {
    private String name;
    private int idNum;

    public Customer(String name, int idNum){
        this.name = name;
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public int getIdNum() {
        return idNum;
    }

    public int compareCustomer(Customer other){
        if (this.equals(other)) return 0;
        int diff = this.getName().compareTo(other.getName());

        if (diff == 0){
            return this.getIdNum() - other.getIdNum();
        }
        return diff;
    }

    public Customer[] prefixMerge(Customer[] list1, Customer[] list2, Customer[] result){
        int point1 = 0;
        int point2 = 0;

        for (int i = 0; i < result.length;  i++){
            int diff = list1[point1].compareCustomer(list2[point2]);

            if (diff == 0){
                result[i] = list1[point1];
                point1 ++;
                point2 ++;
            }
            else if (diff < 0){
                result[i] = list1[point1];
                point1 ++;
            } else {
                result[i] = list2[point2];
                point2 ++;
            }
        }
        return result;
    }
}
