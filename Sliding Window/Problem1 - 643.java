public double findMaxAverage(int[] nums, int k) {
    double currSum = 0, maxSum = 0;

    // Initialize currSum and maxSum to the sum of the initial k elements
    for (int i = 0; i < k; i++)
        currSum += nums[i];
    maxSum = currSum;

    // Start the loop from the kth element 
    // Iterate until you reach the end
    for (int i = k; i < nums.length; i++) {
        // Subtract the left element of the window
        // Add the right element of the window
        currSum += nums[i] - nums[i - k];

        // Update the max
        maxSum = Math.max(maxSum, currSum);
    }

    // Since the problem requires average, we return the average
    return maxSum / k;
}
