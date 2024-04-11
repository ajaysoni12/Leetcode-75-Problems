public class Main {

    /* Brute Force Approach */
    public staic String gcdOfStrings_BruteForce(String str1, String str2) {
        int n = str1.length(); 
        int m = str2.length(); 
        if(n > m) {
            String temp = str1; 
            str1 = str2; 
            str2 = temp; 
            int tempLen = n; 
            n = m; 
            m = tempLen; 
        }

        StringBuilder ans = ""; 
        StringBuilder sub1 = ""; 
        for(int i = 0; i < n; i++) {
            sub1.append(str1.charAt(i)); 
            int j = 0;  
            while(j + i < m) {
                StringBuilder sub2 = (StringBuilder) str2.substring(j, j + i + 1); 
                if(!sub1.equals(sub2)) break; 
                j += i + 1; 
            }

            int k = 0; 
            while(k + i < n) {
                StringBuilder sub3 = (StringBuilder) str1.substring(k, k + i + 1); 
                if(!sub1.equals(sub3)) break;  
                k += i + 1; 
            }
            if(j >=  m && k >= n) ans = sub1; 
        }
        return ans.toString();
    }

    /* Optimal Approach */
    public static String gcdOfStrings_Optimal(String str1, String str2) {
        if((str1 + str2).equals(str2 + str1)) 
            return str1.sustring(0, gcd(str1.length(), str2.length())); 
        return "";
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings_BruteForce(str1, str2));
        System.out.println(gcdOfStrings_Optimal(str1, str2));
    }
}
