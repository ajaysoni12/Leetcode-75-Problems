public static String mergeAlternately(String word1, String word2) {
    int n = word1.length();
    int m = word2.length();
    StringBuilder mergeWord = new StringBuilder();
    int i = 0, j = 0;
    while (i < n || j < m) {
        if (i < n) mergeWord.append(word1.charAt(i++));
        if (j < m) mergeWord.append(word2.charAt(j++));
    }
    return mergeWord.toString();
    /*  TC-O(max(n, m)) SC-O(1) */
}
 