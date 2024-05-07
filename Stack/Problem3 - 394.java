import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        String result = decodeString(s);
        System.out.println(result);
    }

    public static String decodeString(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != ']') {
                st.push(s.charAt(i));
            } else {
                StringBuilder currStr = new StringBuilder();
                while (!st.isEmpty() && st.peek() != '[') {
                    currStr.insert(0, st.pop());
                }
                st.pop(); // pop out open bracket 

                StringBuilder num = new StringBuilder();
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    num.insert(0, st.pop());
                }

                int noOfTime = Integer.parseInt(num.toString());
                StringBuilder decodedStr = new StringBuilder();
                for (int j = 0; j < noOfTime; j++) {
                    decodedStr.append(currStr);
                }

                for (char ch : decodedStr.reverse().toString().toCharArray()) {
                    st.push(ch);
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.insert(0, st.pop());
        }
        return ans.toString();
    }
}
