public class Main {
    public static int largestAltitude(int[] gain) {
        int n = gain.length;
        int maxGain = 0;
        int currGain = 0;
        for (int i = 0; i < n; i++) {
            currGain += gain[i];
            maxGain = Math.max(maxGain, currGain);
        }
        return maxGain;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }
}
