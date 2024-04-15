#include <bits/stdc++.h>
using namespace std;

/* brute force appraoch - using two loops */

/* optimal approach - using sliding window */
int longestSubarray(vector<int>& nums) {
    int n = nums.size();
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

        maxLen = max(maxLen, cnt0 == 0 ? cnt1 - 1 : cnt1);
        j++;
    }
    return maxLen;
    /*  TC-O(n + n) SC-O(1) */
}