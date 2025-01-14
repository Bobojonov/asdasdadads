package neetcode.twoPointers;

import java.util.*;

public class FindTheDifference {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int n : nums1) set1.add(n);
        for(int n : nums2) set2.add(n);
        for (int n : set1){
            if(!set2.contains(n)){
                res1.add(n);
            }
        }
        for (int n : set2){
            if(!set1.contains(n)){
                res2.add(n);
            }
        }
        result.add(res1);
        result.add(res2);
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {-80,-15,-81,-28,-61,63,14,-45,-35,-10};
        int[] nums2 = {-1,-40,-44,41,10,-43,69,10,2};
        System.out.println(findDifference(nums1, nums2));
    }
}
