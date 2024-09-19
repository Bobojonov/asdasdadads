package codingCompetitive.leetcodeSolutions.problems;

public class SearchForARange {

    public int[] searchRange(final int[] A, int B) {
        int l = 0, r = A.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (A[mid] >= B) r = mid;
            else l = mid + 1;
        }
        if (r >= A.length || A[r] != B) return new int[]{-1, -1};
        int start = r, end = -1;
        l = 0;
        r = A.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (A[mid] <= B) l = mid + 1;
            else r = mid;
        }
        end = l - 1;
        return new int[]{start, end};
    }
}
