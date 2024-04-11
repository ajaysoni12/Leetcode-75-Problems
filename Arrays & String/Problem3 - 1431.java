import java.util.*;

public class Main {

    /* Brute Force Approach - (for every kid's find max) */
    public static List<Boolean> kidsWithCandies_BruteForce(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int ithKidTotalCandy = candies[i] + extraCandies;

            // find out max candies 
            int maxCandies = -1;
            for (int j = 0; j < n; j++) {
                maxCandies = Math.max(maxCandies, candies[j]);
            }

            res.add(ithKidTotalCandy >= maxCandies);
        }
        return res;
    }

    /* Optimal Approach - (externally count max element in the given array) */
    public static List<Boolean> kidsWithCandies_Optimal(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> res = new ArrayList<>();

        // find out max candies 
        int maxCandies = -1;
        for (int i = 0; i < n; i++)
            maxCandies = Math.max(maxCandies, candies[i]);

        for (int i = 0; i < n; i++) {
            int ithKidTotalCandy = candies[i] + extraCandies;
            res.add(ithKidTotalCandy >= maxCandies);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result1 = kidsWithCandies_BruteForce(candies, extraCandies);
        System.out.println("Brute Force Approach: " + result1);

        List<Boolean> result2 = kidsWithCandies_Optimal(candies, extraCandies);
        System.out.println("Optimal Approach: " + result2);
    }
}
