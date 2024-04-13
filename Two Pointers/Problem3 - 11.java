import java.util.Arrays;

public class Main {
    /* Optimal approach - two pointer and greedy */
    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;
        int maxArea = 0;
        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int len = right - left;
            maxArea = Math.max(maxArea, minHeight * len);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
        /*  TC-O(n) SC-O(1) */
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height)); // Output: 49
    }
}
