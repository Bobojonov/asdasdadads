package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class triangle {


    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        return 1;

    }
    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3));
        int len = triangle.size();
        List<Integer> dp = triangle.get(triangle.size() - 1);
        System.out.println(dp);
        for (int i = len - 2; i >= 0; i --){
            List<Integer> currRow = new ArrayList<>();
            for (int j = 0; j <= i; j++){
                currRow.add(triangle.get(i).get(j) + Math.min(dp.get(j), dp.get(j + 1)));
            }
            dp = currRow;
        }
        System.out.println(dp.get(0));
    }

}
