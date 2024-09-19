package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.HashMap;
import java.util.Map;

public class largestRange {
    public static int[] largestRange(int[] array) {
        int longestRange = 0;
        int[] range = new int[2];
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num: array) map.put(num, true);
        for (int num: array) {
            if (!map.get(num)) continue;
            map.put(num, false);
            int currentLength = 1;
            int left = num - 1;
            int right = num + 1;
            while (map.containsKey(left)) {
                currentLength++;
                left--;
            }
            while (map.containsKey(right)) {
                currentLength++;
                right++;
            }
            if (currentLength > longestRange) {
                longestRange = currentLength;
                range[0] = left  + 1;
                range[1] = right - 1;
            }
        }
        return range;
    }


    public static void main(String[] args) {
        int[] array = {1, 11, 3, 0, 15, 5, 2, 2, 4, 10, 7, 12, 6};
        System.out.println(largestRange(array));
    }
}
