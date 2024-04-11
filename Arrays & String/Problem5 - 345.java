public class Main {

    /* Brute Force Approach - (use extra space) */
    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U');
    }

    public static String reverseVowels_BruteForce(String s) {
        int n = s.length();
        StringBuilder vowelStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowelStr.append(c);
            }
        }

        int j = vowelStr.length() - 1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                result.append(vowelStr.charAt(j--));
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    /* Optimal Approach - using swapping & two pointer */
    public static String reverseVowels_Optimal(String s) {
        int n = s.length();
        char[] charArray = s.toCharArray();
        int left = 0, right = n - 1;
        while (left < right) {
            while (left < right && !isVowel(charArray[left])) left++;
            while (left < right && !isVowel(charArray[right])) right--;
            if (left < right) {
                char temp = charArray[left];
                charArray[left++] = charArray[right];
                charArray[right--] = temp;
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println("Brute Force Approach: " + reverseVowels_BruteForce(s));
        System.out.println("Optimal Approach: " + reverseVowels_Optimal(s));
    }
}
