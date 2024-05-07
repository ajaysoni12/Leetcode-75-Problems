}
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "a*b*c*d*e*f*g*h*i*j*k*l*m*n*o*p*q*r*s*t*u*v*w*x*y*z";
        String result = removeStars(s);
        System.out.println(result);
    }

    public static String removeStars(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '*') {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.insert(0, st.pop());
        }
        return ans.toString();
    }
}
