import java.util.*;

public class Main {

    /* Optimal Approach - (try to place) */
    public static boolean canPlaceFlowers(List<Integer> flowerbed, int n) {
        int len = flowerbed.size();
        if (n == 0) return true;
        if (len == 1) 
            return (flowerbed.get(0) == 0 && n == 1);

        for (int i = 0; i < len; i++) {
            if (n <= 0) break;
            if (flowerbed.get(i) == 1) continue;

            if (i == 0 && flowerbed.get(i + 1) == 0) {
                flowerbed.set(i, 1);
                n--;
            } else if (i == len - 1 && flowerbed.get(i - 1) == 0) {
                flowerbed.set(i, 1);
                n--;
            } else if (i > 0 && i < len - 1 && flowerbed.get(i - 1) == 0 && flowerbed.get(i + 1) == 0) {
                flowerbed.set(i, 1);
                n--;
            }
        }

        return n <= 0;
    }

    public static void main(String[] args) {
        List<Integer> flowerbed = new ArrayList<>(Arrays.asList(1, 0, 0, 0, 1));
        int n = 1;

        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
