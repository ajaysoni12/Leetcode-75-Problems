#include <bits/stdc++.h>
using namespace std;

/* optimal approach - using hahsing/set */
bool closeStrings(string word1, string word2) {
    int n = word1.size(), m = word2.size();
    if (n != m) return false;
    vector<int> freq1(26, 0), freq2(26, 0);
    unordered_set<char> set1, set2;
    for (auto& it : word1) {
        freq1[it - 'a']++;
        set1.insert(it);
    }
    for (auto& it : word2) {
        freq2[it - 'a']++;
        set2.insert(it);
    }

    sort(freq1.begin(), freq1.end()); 
    sort(freq2.begin(), freq2.end()); 
    return freq1 == freq2 && set1.size() == set2.size(); 
    /* TC-O(n + m + (2 * 26 * Log(26))) SC-O(2*26) */
}