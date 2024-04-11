#include <bits/stdc++.h>
using namespace std;

/* Optimal Approach - using extra space */
string reverseWords(string s) {
    int n = s.size();
    string reverseWord = "";
    string temp = "";

    int i = n - 1;
    while (i >= 0) {

        // take the word 
        while (i >= 0 && s[i] != ' ') {
            temp = s[i] + temp;
            i--;
        }

        // remove tralling zero 
        while (i >= 0 && s[i] == ' ') i--;

        if (temp.size() > 0) {
            if (i >= 0)  temp += ' '; // we have further word in future
            // so take space 
            reverseWord += temp;
            temp = "";
        }
    }
    return reverseWord;
    /*  TC-O(n) SC-O(n) */
}
 