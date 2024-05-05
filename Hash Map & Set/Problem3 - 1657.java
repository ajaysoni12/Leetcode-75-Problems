import java.util.Arrays;
import java.util.HashSet;

public class Main {
    /* optimal approach - using hashing/set */
    static boolean closeStrings(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        if (n != m) return false;
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        
        for (char ch : word1.toCharArray()) {
            freq1[ch - 'a']++;
            set1.add(ch);
        }
        
        for (char ch : word2.toCharArray()) {
            freq2[ch - 'a']++;
            set2.add(ch);
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);
        
        return Arrays.equals(freq1, freq2) && set1.equals(set2);
        /* TC-O(n + m + (2 * 26 * Log(26))) SC-O(2*26) */
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "bca";
        System.out.println("Are word1 and word2 close strings? " + closeStrings(word1, word2));
    }
}
