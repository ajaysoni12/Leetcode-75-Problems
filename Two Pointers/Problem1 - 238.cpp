#include <bits/stdc++.h>
using namespace std;

/* Brute Force Approch - take extra space and copy non zero values */
/* Optimal Approach - using two pointer approach */
void moveZeroes(vector<int>& nums) {
    int n = nums.size();
    int left = 0, right = 0;
    while (right < n) {
        while (right < n && nums[right] == 0) right++;
        if (right < n) swap(nums[left++], nums[right++]);
    }
    /*  TC-O(n + n) SC-O(1) */
}