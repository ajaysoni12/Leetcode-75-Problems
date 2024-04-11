#include <bits/stdc++.h>
using namespace std;


/* Brute Force Approach - (use extra space) */
bool isVowel(char ch) {
    return (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||
        ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U');
}
string reverseVowels(string s) {
    int n = s.size();
    string vowelStr = "";
    for (auto& it : s) {
        if (isVowel(it) == true) {
            vowelStr += it;
        }
    }

    int j = vowelStr.size() - 1;
    for (int i = 0; i < n && j >= 0; i++) {
        if (isVowel(s[i])) {
            s[i] = vowelStr[j--];
        }
    }
    return s;
    /* TC-O(n + n = 2n) SC-O(n) */
}

/* Optimal Approach - using swaping & two pointer */
string reverseVowels(string s) {
    int n = s.size();
    int left = 0, right = n - 1;
    while (left < right) {
        while (left < right && isVowel(s[left]) == false) left++;
        while (left < right && isVowel(s[right]) == false) right--;
        if (left < right) swap(s[left++], s[right--]);
    }
    return s;
    /* TC-O(n) SC-O(1) */
}