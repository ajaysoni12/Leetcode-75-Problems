#include <bits/stdc++.h>
using namespace std;

/* Optimal Approach - (try to place) */
bool canPlaceFlowers(vector<int>& flowerbed, int n) {
    int len = flowerbed.size();
    if(n == 0) return true; 
    if (len == 1) 
        return (flowerbed[0] == 0 && n == 1) ? true : false;
    
    for (int i = 0; i < len; i++) {
        if (n <= 0) break;
        if (flowerbed[i] == 1) continue;

        if (i == 0 && flowerbed[i + 1] == 0) {
            flowerbed[i] = 1;
            n--;
        }
        else if (i == len - 1 && flowerbed[i - 1] == 0) {
            flowerbed[i] = 1;
            n--;
        }
        else if (i > 0 && i < len - 1 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
            flowerbed[i] = 1;
            n--;
        }
    }

    if (n > 0) return false;
    return true;
    /* TC-O(n) SC-O(1) */
}