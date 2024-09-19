package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findKClosestElemens {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        for (int num: arr)
            result.add(num);
        Collections.sort(result, (a, b) -> Math.abs(a - x) - Math.abs(b - x));
        System.out.println(result);
        result = result.subList(0, k);
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4, x = 3;
        System.out.println(findClosestElements(arr, k, x));
    }
}
