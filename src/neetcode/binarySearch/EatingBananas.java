package neetcode.binarySearch;

import java.util.Arrays;

public class EatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int total = 0;
            for (int pile : piles) total += (int) Math.ceil((double) pile / mid);
            if (total <= h) {
                res = mid;
                r = mid - 1;
            } else l = mid + 1;
        }
        return res;
    }
}
