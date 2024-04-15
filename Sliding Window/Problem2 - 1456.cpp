#include <bits/stdc++.h>
using namespace std;

bool isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}

int maxVowels(string s, int k) {
    int n = s.size();
    if (n < k) return 0;
    int mxVowel = 0;
    int currVowel = 0;
    for (int i = 0; i < k; i++) {
        if (isVowel(s[i])) {
            currVowel++;
        }
    }

    mxVowel = max(mxVowel, currVowel);
    int i = 0, j = k - 1;
    while (j < n) {
        if (isVowel(s[i++])) currVowel--;
        if (isVowel(s[++j])) currVowel++;
        mxVowel = max(mxVowel, currVowel);
    }
    return mxVowel;
    /*  TC-O(n) SC-O(1) */
}