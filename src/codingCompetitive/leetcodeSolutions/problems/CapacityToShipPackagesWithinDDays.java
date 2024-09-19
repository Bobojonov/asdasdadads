package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;

public class CapacityToShipPackagesWithinDDays {

    public static int shipWithinDays(int[] weights, int days) {
        return binarySearch(weights, days);
    }

    public static int binarySearch(int[] weights, int days) {
        int max = 0, sum = 0;
        for (int weight: weights) {
            sum += weight;
            max = Math.max(max, weight);
        }
        int l = max, r = sum;
        while (l < r) {
            int mid = (l + r) / 2;
            if (isAvailable(weights, mid, days))
                r = mid;
            else
                l = mid + 1;
        }
        return r;
    }

    public static boolean isAvailable(int[] weights, int mid, int days) {
        int day = 1, curr = 0;
        for (int weight: weights) {
            curr += weight;
            if (curr > mid) {
                day++;
                curr = weight;
            }
        }
        return day <= days;
    }
    public static void main(String[] args) {
        int weights[] = {3,2,2,4,1,4};
        int days = 3;
        System.out.println(shipWithinDays(weights, days));
    }
}
