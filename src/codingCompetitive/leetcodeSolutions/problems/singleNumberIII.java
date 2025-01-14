package codingCompetitive.leetcodeSolutions.problems;

public class singleNumberIII {

    public int[] singleNumber(int[] nums) {
        int mask = 0;
        for (int num: nums)
            mask ^= num;
        System.out.println(mask);
        int diff = mask & (-mask);
        int res = 0;
        for (int num : nums) if ((num & diff) != 0) res ^= num;
        return new int[]{res, mask ^ res};
    }

}
