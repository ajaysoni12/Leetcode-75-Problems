import java.util.Arrays;

public class Main {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        int prevSum = 0;
        for (int i = 0; i < n; i++) {
            if (prevSum == (sum - prevSum - nums[i])) return i;
            prevSum += nums[i];
        }
        return -1;
        /*  TC-O(n) SC-O(1) */
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
}
