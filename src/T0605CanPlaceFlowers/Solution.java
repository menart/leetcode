package T0605CanPlaceFlowers;

public class Solution {

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        int size = flowerbed.length - 1;
        for (int i = 0; i < size+1; i++) {
            if (flowerbed[i] == 0) {
                if ((i == 0 || flowerbed[i - 1] == 0)
                        && (i == size || flowerbed[i + 1] == 0)) {
                    i++;
                    if (--n == 0) return true;
                }
            }
        }
        System.gc();
        return false;
    }
}
