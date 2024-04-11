public class Main {

    /* Optimal Approach - using extra space */
    public static String reverseWords(String s) {
        int n = s.length();
        StringBuilder reverseWord = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        int i = n - 1;
        while (i >= 0) {

            // take the word 
            while (i >= 0 && s.charAt(i) != ' ') {
                temp.insert(0, s.charAt(i));
                i--;
            }

            // remove trailing spaces 
            while (i >= 0 && s.charAt(i) == ' ') i--;

            if (temp.length() > 0) {
                if (i >= 0) temp.insert(0, ' '); // we have further word in future, so add space
                reverseWord.append(temp);
                temp.setLength(0); // clear temp StringBuilder
            }
        }
        return reverseWord.toString();
    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s)); // Output: "world hello"
    }
}
