import java.util.HashMap;
import java.util.HashSet;

public class Main {
    /* brute force - using nested loops */
    /* optimal approach - using hashing/set */
    static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int count : map.values()) {
            if (!set.add(count)) {
                return false;
            }
        }
        
        return true;
        /*  TC-O(n + n or nLogn) SC-O(n + n) */
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1, 1, 3};
        int[] arr2 = {1, 2};
        
        System.out.println("Are occurrences unique in arr1? " + uniqueOccurrences(arr1));
        System.out.println("Are occurrences unique in arr2? " + uniqueOccurrences(arr2));
    }
}
