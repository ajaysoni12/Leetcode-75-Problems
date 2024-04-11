import java.util.*;

public class Main {

    /* Optimal Approach */
    public static int compress(List<Character> chars) {
        int n = chars.size();
        int ans = 0;
        int i = 0;
        
        while (i < n) {
            char ch = chars.get(i);
            int cnt = 0;

            while (i < n && chars.get(i) == ch) {
                cnt++;
                i++;
            }
            
            chars.set(ans++, ch);
            
            if (cnt > 1) {
                for (char c : String.valueOf(cnt).toCharArray()) {
                    chars.set(ans++, c);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Character> chars = new ArrayList<>(Arrays.asList('a', 'a', 'b', 'b', 'c', 'c', 'c'));

        System.out.println("Length after compression: " + compress(chars));
        System.out.println("Compressed characters: " + chars.subList(0, compress(chars)));
    }
}
