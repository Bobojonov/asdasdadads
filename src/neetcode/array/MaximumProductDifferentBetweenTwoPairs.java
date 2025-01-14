package neetcode.array;

public class MaximumProductDifferentBetweenTwoPairs {
    public int maxProductDifference(int[] nums) {
        int max1 = 1, max2 = 1, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (max1 <= num) {
                max2 = max1;
                max1 = num;
            } else if (max2 <= num) {
                max2 = num;
            }
            if (min1 >= num) {
                min2 = min1;
                min1 = num;
            } else if (min2 >= num) min2 = num;
        }
        System.out.println(max1 + " " + max2);
        System.out.println(min1 + " " + min2);
        return (max1 * max2) - (min1 * min2);
    }
}
