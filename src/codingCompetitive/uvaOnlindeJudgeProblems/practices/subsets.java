package codingCompetitive.uvaOnlindeJudgeProblems.practices;

import java.util.*;

public class subsets {

    public static void main(String[] args) {
        int[] arr = new int[20];
        for(int i = 0; i < 20; i++) arr[i] = i;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, 20); ++i) {
            String binary = Integer.toBinaryString(i);
            binary = String.format("%" + 20 + "s", binary).replace(' ', '0');
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < binary.length(); ++j) {
                if (binary.charAt(j) == '1') {
                    subset.add(arr[j]);
                }
            }
            list.add(subset);
        }
        for (List<Integer> subset : list) {
            System.out.println(subset);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> tmp = new ArrayList<>();
            for (List<Integer> res : result) {
                List<Integer> list = new ArrayList<>(res);
                list.add(nums[i]);
                if(!result.contains(list)) {
                    tmp.add(list);
                }
            }
            result.addAll(tmp);

        }

        return result;
    }

}
