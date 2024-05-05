#include <bits/stdc++.h>
using namespace std;

/* brute force appraoch - using 4 loops */

/* optimal approach - using hashing/set */
int equalPairs(vector<vector<int>>& grid) {
    int n = grid.size();
    map<vector<int>, int> mp1, mp2;

    for (int i = 0; i < n; i++) {
        vector<int> list1, list2;
        for (int j = 0; j < n; j++) {
            list1.push_back(grid[i][j]); // take row 
            list2.push_back(grid[j][i]); // take col
        }

        mp1[list1]++;
        mp2[list2]++;
    }

    int cnt = 0;
    for (auto& it : mp1) {
        if (mp2.find(it.first) != mp2.end()) {
            int howMany = mp2[it.first];
            cnt += (howMany * it.second);
        }
    }
    return cnt;
    /*  TC-O(n^2 + n) SC-O(2*n*n)*/
}