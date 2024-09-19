package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LargestNumberII {

    public String largest(int[] nums) {
        int n = nums.length;
        String[] chars = new String[n];
        for (int i = 0; i < n; i++)
            chars[i] = String.valueOf(nums[i]);
        Arrays.sort(chars, new ComparatorLargestNumber());
        if (chars[0].equals("0")) return "0";
        StringBuilder res = new StringBuilder();
        for (String ch: chars)
            res.append(ch);
        return res.toString();
    }

    private class ComparatorLargestNumber implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            String s1 = o1 + o2;
            String s2 = o2 + o1;
            return s2.compareTo(s1);
        }
    }

}
