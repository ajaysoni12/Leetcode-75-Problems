import java.util.Arrays;

public class Main {
    public static int longestSubarray(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        int cnt0 = 0, cnt1 = 0;
        int i = 0, j = 0;
        while (j < n) {
            if (nums[j] == 0) cnt0++;
            else cnt1++;

            while (i < j && cnt0 > 1) {
                if (nums[i] == 0) cnt0--;
                else cnt1--;
                i++;
            }

            maxLen = Math.max(maxLen, cnt0 == 0 ? cnt1 - 1 : cnt1);
            j++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(longestSubarray(nums));
    }
}
