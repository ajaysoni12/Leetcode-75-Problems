import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] ast = {5, 10, -5};
        List<Integer> result = asteroidCollision(ast);
        System.out.println(result);
    }

    public static List<Integer> asteroidCollision(int[] ast) {
        int n = ast.length;

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.isEmpty() || ast[i] > 0) {
                st.push(ast[i]);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(ast[i])) {
                    st.pop();
                }

                if (!st.isEmpty() && st.peek() == Math.abs(ast[i])) {
                    st.pop();
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(ast[i]);
                }
            }
        }

        List<Integer> ans = new ArrayList<>(st.size());
        while (!st.isEmpty()) {
            ans.add(0, st.pop());
        }
        return ans;
    }
}
