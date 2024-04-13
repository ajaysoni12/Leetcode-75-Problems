public class Main {
    /* Optimal Approach - using two pointer approach */
    public static boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        if (n > m) return false;

        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
        /*  TC-O(n + n) SC-O(1) */
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t)); // Output: true
    }
}
