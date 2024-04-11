#include <bits/stdc++.h>
using namespace std;

/* Brute Force Approach - (for every kid's find max) */
vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
    int n = candies.size();
    vector<bool> res(n, 0);

    for (int i = 0; i < n; i++) {
        int ithKidTotalCandy = candies[i] + extraCandies;

        // find out max candies 
        int maxCandies = -1;
        for (int j = 0; j < n; j++) {
            maxCandies = max(maxCandies, candies[j]);
        }

        if (ithKidTotalCandy >= maxCandies) res[i] = 1;
    }
    return res;

    /* TC-O(n*n = n^2) SC-O(1) */
}

/* Optimal Approach - (externaly count max element in the give array) */
vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
    int n = candies.size();
    vector<bool> res(n, 0);

    // find out max candies 
    int maxCandies = -1;
    for (int i = 0; i < n; i++)
        maxCandies = max(maxCandies, candies[i]);

    for (int i = 0; i < n; i++) {
        int ithKidTotalCandy = candies[i] + extraCandies;
        if (ithKidTotalCandy >= maxCandies) {
            res[i] = 1;
        }
    }

    return res;
    /* TC-O(n + n = 2n) SC-O(1) */
}