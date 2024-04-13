#include <bits/stdc++.h>
using namespace std;

/* brute force approach - using two loops */

/* optimal approach - two pointer and greedy*/
int maxArea(vector<int>& height) {
    int n = height.size();
    int left = 0, right = n - 1;
    int maxArea = 0;
    while (left < right) {
        int minHeight = min(height[left], height[right]);
        int len = right - left;
        maxArea = max(maxArea, minHeight * len);
        if (height[left] < height[right]) left++;
        else right--;
    }
    return maxArea;
    /*  TC-O(n) SC-O(1) */
}