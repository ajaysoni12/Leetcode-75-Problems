import java.util.Arrays;

public class Main {
    public static int longestOnes(int[] nums, int k) {
        int n = nums.length;

        int maxLen = 0, cntOnes = 0;
        int i = 0, j = 0;
        while (j < n) {
            if (nums[j] == 0) cntOnes++;
            while (i <= j && cntOnes > k) {
                if (nums[i] == 0) cntOnes--;
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1, 1};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
}
