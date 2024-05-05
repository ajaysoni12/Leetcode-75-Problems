import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    /* brute force approach - two loops */
    /* optimal approach - using hashing/set */
    static List<List<Integer>> findDifference(List<Integer> nums1, List<Integer> nums2) {
        Set<Integer> set1 = new HashSet<>(nums1);
        Set<Integer> set2 = new HashSet<>(nums2);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        for (int num : set1)
            if (!set2.contains(num))
                ans.get(0).add(num);

        for (int num : set2)
            if (!set1.contains(num))
                ans.get(1).add(num);

        return ans;
        /* TC-O(2*(n + m)) SC-O(n + m) */
    }

    public static void main(String[] args) {
        List<Integer> nums1 = List.of(1, 2, 3, 4, 5);
        List<Integer> nums2 = List.of(3, 4, 5, 6, 7);

        List<List<Integer>> result = findDifference(nums1, nums2);
        System.out.println("Difference between nums1 and nums2:");
        System.out.println("Elements in nums1 but not in nums2: " + result.get(0));
        System.out.println("Elements in nums2 but not in nums1: " + result.get(1));
    }
}
