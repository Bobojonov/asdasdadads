package codingCompetitive.leetcodeSolutions.problems;

import java.util.List;

public class MedianOfArray {

    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        int n = a.size(), m = b.size();
        if (m < n) return findMedianSortedArrays(b, a);
        int l = 0, r = 2 * m;
        double l1, l2 = 0, r1, r2;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            int next_mid = n + m - mid;
            if (next_mid == 0) l1 = Integer.MIN_VALUE;
            else l1 = a.get((next_mid - 1) / 2);
            if (mid == 0) l2 = Integer.MIN_VALUE;
            else b.get((mid - 1) / 2);
            if (next_mid == n * 2) r1 = Integer.MAX_VALUE;
            else r1 = a.get(next_mid / 2);
            if (mid == m * 2) r2 = Integer.MAX_VALUE;
            else r2 = b.get(mid / 2);
            if (l1 > r2) l = mid + 1;
            else if (l2 > r1) r = mid - 1;
            else return (Math.min(l1, l2) + Math.min(r1, r2)) / 2;
        }
        return l2;
    }
}
