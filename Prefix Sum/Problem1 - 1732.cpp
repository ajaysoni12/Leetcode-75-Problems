#include <bits/stdc++.h>
using namespace std;

/* brute force approach - using extra prefix array */

/* optimal approach - using prefix sum */
int largestAltitude(vector<int>& gain) {
    int n = gain.size();
    int maxGain = 0;
    int currGain = 0;
    for (int i = 0; i < n; i++) {
        currGain += gain[i];
        maxGain = max(maxGain, currGain);
    }
    return maxGain;
    /*  TC-O(n) SC-O(1)  */
}