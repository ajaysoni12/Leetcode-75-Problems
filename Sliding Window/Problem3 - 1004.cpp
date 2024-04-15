#include <bits/stdc++.h>
using namespace std;

/* brute force approach - using two loops */

/* optimal approach - using sliding window approach */
int longestOnes(vector<int>& nums, int k) {
    int n = nums.size(); 
    
    int maxLen = 0, cntOnes = 0; 
    int i = 0, j = 0; 
    while(j < n) {
        if(nums[j] == 0) cntOnes++; 
        while(i <= j && cntOnes > k) {
            if(nums[i] == 0) cntOnes--; 
            i++; 
        }

        maxLen = max(maxLen, j - i + 1); 
        j++; 
    }
    return maxLen; 
    /*  TC-O(n + n) SC-O(1) */
}