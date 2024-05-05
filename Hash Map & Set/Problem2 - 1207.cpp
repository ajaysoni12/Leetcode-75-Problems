#include <bits/stdc++.h>
using namespace std;

/* brute force - using nested loops */

/* optimal approach - using hashing/set */
bool uniqueOccurrences(vector<int>& arr) {
    unordered_map<int, int> mp;
    unordered_set<int> set;
    for (auto& it : arr) mp[it]++;
    for (auto& it : mp) set.insert(it.second);
    return mp.size() == set.size();
    /*  TC-O(n + n or nLogn) SC-O(n + n) */
}