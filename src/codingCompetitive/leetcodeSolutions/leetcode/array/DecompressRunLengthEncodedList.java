package codingCompetitive.leetcodeSolutions.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            List<Integer> freq = Collections.nCopies(nums[i], nums[i + 1]);
            list.addAll(freq);
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
