import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Main {
    /* optimal approach - using hashing/set */
    static int equalPairs(Vector<Vector<Integer>> grid) {
        int n = grid.size();
        Map<Vector<Integer>, Integer> mp1 = new HashMap<>();
        Map<Vector<Integer>, Integer> mp2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Vector<Integer> list1 = new Vector<>();
            Vector<Integer> list2 = new Vector<>();
            for (int j = 0; j < n; j++) {
                list1.add(grid.get(i).get(j)); // take row 
                list2.add(grid.get(j).get(i)); // take col
            }

            mp1.put(list1, mp1.getOrDefault(list1, 0) + 1);
            mp2.put(list2, mp2.getOrDefault(list2, 0) + 1);
        }

        int cnt = 0;
        for (Map.Entry<Vector<Integer>, Integer> entry : mp1.entrySet()) {
            if (mp2.containsKey(entry.getKey())) {
                int howMany = mp2.get(entry.getKey());
                cnt += (howMany * entry.getValue());
            }
        }
        return cnt;
        /*  TC-O(n^2 + n) SC-O(2*n*n)*/
    }

    public static void main(String[] args) {
        Vector<Vector<Integer>> grid = new Vector<>();
        grid.add(new Vector<>(Vector.of(1, 2, 3)));
        grid.add(new Vector<>(Vector.of(4, 5, 6)));
        grid.add(new Vector<>(Vector.of(7, 8, 9)));

        System.out.println("Number of equal pairs: " + equalPairs(grid));
    }
}
