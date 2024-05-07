#include <bits/stdc++.h>
using namespace std;

/* optimal approach - using stack */
string removeStars(string s) {
    int n = s.size();
    stack<char> st;
    for (int i = 0; i < n; i++) {
        if (s[i] == '*')  st.pop();
        else st.push(s[i]);
    }

    string ans = "";
    while (!st.empty()) {
        ans = st.top() + ans;
        st.pop();
    }
    return ans;
    /* TC-O(2n) SC-O(n) */
}