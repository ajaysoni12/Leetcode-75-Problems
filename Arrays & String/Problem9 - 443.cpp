#include <bits/stdc++.h>
using namespace std;

/* Optimal Approach */
int compress(vector<char>& chars) {
    int n = chars.size();
    int ans = 0;
    int i = 0;
    while (i < n) {
        char ch = chars[i];
        int cnt = 0;

        while (i < n && chars[i] == ch) {
            cnt++;
            i++;
        }
        chars[ans++] = ch;
        if (cnt > 1) {
            for (auto c : to_string(cnt)) {
                chars[ans++] = c;
            }
        }
    }
    return ans;
    /* TC-O(n + n = 2n) SC-O(1) */
}