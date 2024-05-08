package Queue;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        q.offer(t);
        while (!q.isEmpty() && q.peek() < (t - 3000)) {
            q.poll();
        }

        return q.size();
    }
}
