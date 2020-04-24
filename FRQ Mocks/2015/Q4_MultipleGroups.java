/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */
import java.util.*;

public class Q4_MultipleGroups {
    private List<Q4_NumberGroup> groupList;

    public Q4_MultipleGroups(List<Q4_NumberGroup> groupList) {
        this.groupList = groupList;
    }

    public boolean contains(int num){
        for (Q4_NumberGroup i : groupList) {
            if (i.contains(num)){return true;}
        }
        return false;
    }
}
