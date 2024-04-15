#include <bits/stdc++.h>
using namespace std;

/* optimal appraoch - using prefix sum */
int pivotIndex(vector<int>& nums) {
    int n = nums.size();
    int sum = accumulate(nums.begin(), nums.end(), 0);
    int prev_sum = 0;
    for (int i = 0; i < n; i++) {
        if (prev_sum == (sum - prev_sum - nums[i])) return i;
        prev_sum += nums[i];
    }
    return -1;
    /*  TC-O(n) SC-O(1) */
}