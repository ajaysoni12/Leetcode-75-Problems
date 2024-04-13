#include <bits/stdc++.h>
using namespace std;

/* Optimal Approach - using two pointer approach */
bool isSubsequence(string s, string t) {
    int n = s.size(), m = t.size();
    if (n > m) return false;

    int i = 0, j = 0;
    while (i < n && j < m) {
        if (s[i] == t[j])  i++;
        j++;
    }
    return i == n;
    /*  TC-O(n) SC-O(1) */
}