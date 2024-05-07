#include <bits/stdc++.h>
using namespace std;

/* optimal appraoach - using stack */
string decodeString(string s) {
    int n = s.size();

    stack<char> st;
    for (int i = 0; i < n; i++) {
        if (s[i] != ']') st.push(s[i]);
        else {
            string curr_str = "";
            while (!st.empty() && st.top() != '[') {
                curr_str = st.top() + curr_str;
                st.pop();
            }
            st.pop(); // pop out open bracket 

            string num = "";
            while (!st.empty() && (st.top() >= '0' && st.top() <= '9')) {
                num = st.top() + num;
                st.pop();
            }

            int noOfTime = stoi(num);
            while (noOfTime--) {
                for (int j = 0; j < curr_str.size(); j++) {
                    st.push(curr_str[j]);
                }
            }
        }
    }

    string ans = "";
    while (!st.empty()) {
        ans = st.top() + ans;
        st.pop();
    }
    return ans;
}