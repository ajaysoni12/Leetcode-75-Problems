#include <bits/stdc++.h>
using namespace std;

/* optimal approach - using queue */
class RecentCounter {
private: 
    queue<int> q; 
public:
    RecentCounter() { }
    
    int ping(int t) {
        q.push(t);   
        while(!q.empty() && q.front() < (t - 3000)) {
            q.pop(); 
        }

        return q.size(); 
    }
};