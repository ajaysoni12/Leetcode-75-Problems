import java.util.*;

public class Main {

    /* Brute Force Approach - (using two loops) */
    public static int[] productExceptSelf_BruteForce(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i != j)
                    prod *= nums[j];
            }
            res[i] = prod;
        }
        return res;
    }

    /* Optimal Approach - (prefix product & suffix product) */
    public static int[] productExceptSelf_Optimal(int[] nums) {
        int n = nums.length;
        int[] products = new int[n];

        int currPreProd = 1;
        for (int i = 0; i < n; i++) {
            products[i] = currPreProd;
            currPreProd *= nums[i];
        }

        int currSuffProd = 1;
        for (int i = n - 1; i >= 0; i--) {
            products[i] *= currSuffProd;
            currSuffProd *= nums[i];
        }
        return products;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println("Brute Force Approach: " + Arrays.toString(productExceptSelf_BruteForce(nums)));
        System.out.println("Optimal Approach: " + Arrays.toString(productExceptSelf_Optimal(nums)));
    }
}
