import java.util.Arrays;

public class Main {
    /* Optimal approach - greedy + two pointer */
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0, right = nums.length - 1;
        int ope = 0;
        while (left < right) {
            if (nums[left] + nums[right] == k) {
                ope++;
                left++;
                right--;
            } else if (nums[left] + nums[right] < k) {
                left++;
            } else {
                right--;
            }
        }
        return ope;
        /*  TC-O(nLogn + n) SC-O(1) */
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 5;
        System.out.println(maxOperations(nums, k)); // Output: 2
    }
}
