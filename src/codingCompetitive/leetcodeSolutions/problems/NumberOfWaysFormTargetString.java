package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfWaysFormTargetString {

    public static int numWays(String[] words, String target) {
        long mod = (long) 1e9 + 7;
        int n = target.length();
        long[] ways = new long[n + 1];
        ways[0] = 1;
        for (int i = 0; i < words[0].length(); i++) {
            int[] cnt = new int[26];
            for (String c: words)
                cnt[c.charAt(i) -'a']++;
            for (int j = n - 1; j >= 0; j--)
                ways[j + 1] += ways[j] * cnt[target.charAt(j) - 'a'] % mod;
        }
        return (int)(ways[n] % mod);
    }

    public static void main(String[] args) {
        String[] words = new String[]{"acca","bbbb","caca"};
        String target = "aba";
        System.out.println(numWays(words, target));
    }
}
