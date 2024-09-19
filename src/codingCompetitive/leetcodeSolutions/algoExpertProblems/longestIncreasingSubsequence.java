package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class longestIncreasingSubsequence {
    public static List<Integer> longestIncreasingSubsequence(int[] array) {
        int len = array.length;
        int[] dp = new int[len];
        int[] index = new int[len];
        Arrays.fill(dp, 1);
        Arrays.fill(index, -1);
        int longest = 1, end_index = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j >=0; j--) {
                if (array[i] > array[j]){
                    if (dp[i] < dp[j] + 1){
                        dp[i] = dp[j] + 1;
                        index[i] = j;
                    }
                    if (longest < dp[i]) {
                        longest = dp[i];
                        end_index = i;
                    }
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        while (index[end_index] != -1) {
            result.add(array[end_index]);
            end_index = index[end_index];
        }
        result.add(array[end_index]);
        Collections.reverse(result);
        return result;
    }
}
