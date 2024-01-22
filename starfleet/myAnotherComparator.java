package starfleet;

import java.util.Comparator;
import java.util.Map;

/**
 * Compares two Map.Entry objects first by their Integer values, then by their OfficerRank keys if values are equal.
 * Specifically designed for sorting Map.Entry objects containing OfficerRank as keys and Integer as values.
 */
public class myAnotherComparator implements Comparator<Map.Entry<OfficerRank, Integer>> {
    
    //return A negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
     
    public int compare(Map.Entry<OfficerRank, Integer> a, Map.Entry<OfficerRank, Integer> b) {
        int first_compare = Integer.compare(a.getValue(), b.getValue()); // Compare by values
        if (first_compare != 0) // If values are not equal, return comparison result
            return first_compare;
        return a.getKey().compareTo(b.getKey()); // If values are equal, compare by keys (OfficerRank)
    }
}
