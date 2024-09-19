package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LineReflection {

    public boolean isReflected(int[][] points) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashSet<String> set = new HashSet<>();
        for(int[] point:points){
            max = Math.max(max, point[0]);
            min = Math.min(min, point[0]);
            String s = point[0] + "a" + point[1];
            set.add(s);
        }
        int sum = max + min;
        for (int[] point: points) {
            String s = (sum - point[0]) + "a" + point[1];
            if( !set.contains(s))
                return false;
        }
        return true;
    }
}
