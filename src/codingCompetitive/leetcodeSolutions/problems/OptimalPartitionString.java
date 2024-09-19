package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;

public class OptimalPartitionString {

    public int partitionString(String s) {
        int i = 0, cnt = 1, f = 0;
        while (i < s.length()) {
            int x = s.charAt(i) - 'a';
            if ((f & (1 << x)) != 0) {
                f = 0;
                cnt++;
            }
            f = f | (1 << x);
            i++;
        }
        return cnt;
    }
}

/*
abacaba
a b  c
4 5  3
cnt = 4
l = 4

 */