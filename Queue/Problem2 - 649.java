import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();

        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') rad.add(i);
            else dir.add(i);
        }

        while (!rad.isEmpty() && !dir.isEmpty()) {
            if (rad.peek() < dir.peek())
                rad.add(n++);
            else
                dir.add(n++);

            rad.poll();
            dir.poll();
        }

        if (rad.isEmpty()) return "Dire";
        return "Radiant";
    }
}
