package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) set.add(num);
        int longest = 1, currNum = 0, currLongest = 0;
        for (int num: nums) {
            if (!set.contains(num - 1)){
                currNum = num;
                currLongest = 0;
            }
            while (set.contains(currNum)) {
                currNum += 1;
                currLongest += 1;
            }
            longest = Math.max(currLongest, longest);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));

    }
}
