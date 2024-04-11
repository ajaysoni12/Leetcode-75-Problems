import java.util.*;

public class Main {

    /* Brute Force Approach - using three loops */
    public static boolean increasingTriplet_BruteForce(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] < nums[j] && nums[j] < nums[k])
                        return true;
                }
            }
        }
        return false;
    }

    /* Better Approach - using two loops and extra space */
    public static boolean increasingTriplet_Better(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n]; // i'th index stores how many elements are lesser than ith element

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] < nums[j] && dp)[i] <= dp[j] {
                    dp[j]++;
                    if (dp[j] >= 2) return true;
                }
            }
        }
        return false;
    }

    /* Optimal Approach - greedy (keep track of two minimum values) */
    public static boolean increasingTriplet_Optimal(int[] nums) {
        int n = nums.length;
        int prev1 = Integer.MAX_VALUE, prev2 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] <= prev1) prev1 = nums[i];
            else if (nums[i] <= prev2) prev2 = nums[i];
            else return true; // yes, we got three triplets
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        
        System.out.println("Brute Force Approach: " + increasingTriplet_BruteForce(nums));
        System.out.println("Better Approach: " + increasingTriplet_Better(nums));
        System.out.println("Optimal Approach: " + increasingTriplet_Optimal(nums));
    }
}
