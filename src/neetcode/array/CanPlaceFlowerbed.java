package neetcode.array;

public class CanPlaceFlowerbed {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length + 2;
        int[] fl = new int[len];
        System.arraycopy(flowerbed, 0, fl, 1, flowerbed.length);
        for (int i = 1; i < len - 1; i++) {
            if (fl[i - 1] == 0 && fl[i] == 0 && fl[i + 1] == 0) {
                n--;
                fl[i] = 1;
            }
        }
        return n <= 0;
    }
}
