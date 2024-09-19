package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.*;
import java.util.stream.Collectors;

public class fourNumberSum {

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        int l = 0, r = array.length - 1, l1 = 1, r1 = r - 1;
        HashMap<Integer, List<Integer[]> > map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                List<Integer[]> list;
                if (map.containsKey(sum))
                    list = map.get(sum);
                else list = new ArrayList<>();
                list.add(new Integer[] {array[i], array[j]});
                map.put(sum, list);
            }
        }
        ArrayList<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int remain = targetSum - array[i] - array[j];
                if (map.containsKey(remain)) {
                    List<Integer[]> list = map.get(remain);
                    for (Integer[] arr: list) {
                        if (!isEqual(array[i], array[j], arr[0], arr[1], result)) {
                            result.add(new Integer[] {array[i], array[j], arr[0], arr[1]});
                        }
                    }
                }
            }
        }
        return result;
    }

    public static boolean isEqual(int i, int j, int k, int t, ArrayList<Integer[]> list) {
        if (i == j || i == k || i == t || j == k || j == t || k == t) return true;
        for (Integer[] key: list) {
            Set<Integer> set = Arrays.stream(key).collect(Collectors.toSet());
            Boolean checked = (set.contains(i) && set.contains(j) && set.contains(k) && set.contains(t));
            if (checked) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {7, 6, 4, -1, 1, 2, 3};
        int targetSum = 16;
        System.out.println(fourNumberSum(array, targetSum));
    }
}
