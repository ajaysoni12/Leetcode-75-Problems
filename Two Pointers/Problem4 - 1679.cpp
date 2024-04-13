#include <bits/stdc++.h>
using namespace std;

/* brute force appraoch - for each element find k - ele and remove */

/* optimal appraoch - greedy + two pointer */
int maxOperations(vector<int>& nums, int k) {
    int n = nums.size();
    sort(nums.begin(), nums.end());

    int left = 0, right = n - 1;
    int ope = 0;
    while (left < right) {
        if (nums[left] + nums[right] == k) {
            ope++;
            left++, right--;
        }
        else if (nums[left] + nums[right] < k) left++;
        else right--;
    }
    return ope;
    /*  TC-O(nLogn + n) SC-O(1) */
}