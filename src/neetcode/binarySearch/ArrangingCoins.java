package neetcode.binarySearch;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        long res = (long) Math.floor((Math.sqrt(1 + 8  * n) - 1) / 2);
        return (int) res;
    }
}
