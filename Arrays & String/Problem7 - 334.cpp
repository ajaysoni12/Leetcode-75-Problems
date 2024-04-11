#include <bits/stdc++.h>
using namespace std;

/* Brute Force Approach - using three loopos */
bool increasingTriplet(vector<int>& nums) {
    int n = nums.size();
    for (int i = 0; i < n - 2; i++) {
        for (int j = i + 1; j < n - 1; j++) {
            for (int k = j + 1; k < n; k++) {
                if (nums[i] < nums[j] && nums[j] < nums[k])
                    return true;
            }
        }
    }
    return false;
    /*  TC-O(n^3) SC-O(1) */
}

/* Better Approach - using two loops and extra space */
bool increasingTriplet(vector<int>& nums) {
    int n = nums.size();
    vector<int> dp(n, 1); // i'th index store how many lesser than ith element

    for (int i = 1; i < n; i++) {
        for (int j = 0; j < i; j++) {
            if (nums[i] < nums[j] && dp[i] <= dp[j]) {
                dp[j]++;
                if (dp[j] >= 3) return true;
            }
        }
    }
    return false;
    /*  TC-O(n^2) SC-O(n) */
}

/* Optimal Approach - greedy(kepp track of two min value) */
bool increasingTriplet(vector<int>& nums) {
    int n = nums.size();
    int prev1 = INT_MAX, prev2 = INT_MAX;

    for (int i = 0; i < n; i++) {
        if (nums[i] <= prev1) prev1 = nums[i];
        else if (nums[i] <= prev2) prev2 = nums[i];
        else return true; // yes we got three triplets
    }
    return false;
}   