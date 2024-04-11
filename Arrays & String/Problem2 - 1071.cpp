#include <bits/stdc++.h>
using namespace std;

/* Brute Force Approach */
string gcdOfStrings(string str1, string str2) {
    int n = str1.size();
    int m = str2.size();
    if (n > m) {
        swap(str1, str2);
        swap(n, m);
    }
    string ans = "";
    string sub1 = "";
    for (int i = 0; i < n; i++) {
        sub1 += str1[i];
        int j = 0;
        while (j + i < m) {
            string sub2 = str2.substr(j, i + 1);
            if (sub1 != sub2) break;
            j += i + 1;
        }
        int k = 0;
        while (k + i < n) {
            string sub3 = str1.substr(k, i + 1);
            if (sub1 != sub3) break;
            k += i + 1;
        }
        cout << j << " " << i << endl;
        if (j >= m && k >= n) {
            ans = sub1;
        }
    }
    return ans;
    /* TC-O(min(n, m) * (max(n, m) + min(n, m))) SC-O(n) */
}

/* Optimal Approach */
string gcdOfStrings(string str1, string str2) {
    if (str1 + str2 == str2 + str1)
        return str1.substr(0, __gcd(str1.size(), str2.size()));
    return "";
    /* TC-O(Log(Log(n))) SC-O(1) */
}