#include <bits/stdc++.h>
using namespace std;

/* Brute Force Approach - (using two loops) */
vector<int> productExceptSelf(vector<int>& nums) {
    int n = nums.size();
    vector<int> res(n);

    for (int i = 0; i < n; i++) {
        int prod = 1;
        for (int j = 0; j < n; j++) {
            if (i != j)
                prod *= nums[j];
        }
        res[i] = prod;
    }
    return res;
    /*  TC-O(n^2) SC-O(1)  */
}

/* Optimal Approach - (prefix prod & suffix prod) */
vector<int> productExceptSelf(vector<int>& nums) {
    int n = nums.size();
    vector<int> products(n);

    int curr_pre_prod = 1;
    for (int i = 0; i < n; i++) {
        products[i] = curr_pre_prod;
        curr_pre_prod = curr_pre_prod * nums[i];
    }

    int curr_suff_prod = 1;
    for (int i = n - 1; i >= 0; i--) {
        products[i] = products[i] * curr_suff_prod;
        curr_suff_prod = curr_suff_prod * nums[i];
    }
    return products;
    /*  TC-O(n + n = 2n) SC-O(1)  */
}