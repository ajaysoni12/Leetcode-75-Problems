#include <bits/stdc++.h>
using namespace std;

/* Optimal Approach*/
string mergeAlternately(string word1, string word2) {
	int n = word1.size(), m = word2.size();
	string mergeWord = "";
	int i = 0, j = 0;
	while (i < n || j < m) {
		if (i < n) mergeWord += word1[i++];
		if (j < m) mergeWord += word2[j++];
	}
	return mergeWord;

	/* TC-O(max(n, m)) SC-O(max(n, m)) */
}
