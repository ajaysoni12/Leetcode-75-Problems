public class Main {
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int maxVowels(String s, int k) {
        int n = s.length();
        if (n < k) return 0;
        int mxVowel = 0;
        int currVowel = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currVowel++;
            }
        }

        mxVowel = Math.max(mxVowel, currVowel);
        int i = 0, j = k - 1;
        while (j < n) {
            if (isVowel(s.charAt(i++))) currVowel--;
            if (isVowel(s.charAt(++j))) currVowel++;
            mxVowel = Math.max(mxVowel, currVowel);
        }
        return mxVowel;
        /*  TC-O(n + n) SC-O(1) */
    }

    public static void main(String[] args) {
        String s = "abciiieaeiou";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }
}
