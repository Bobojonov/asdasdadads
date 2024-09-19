package neetcode.slidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        for (int num: arr) res.add(num);
        res.sort(Comparator.comparingInt(a -> Math.abs(a - x)));
        List<Integer> result = res.subList(0, k);
        Collections.sort(result);
        return result;
        
    }
}
