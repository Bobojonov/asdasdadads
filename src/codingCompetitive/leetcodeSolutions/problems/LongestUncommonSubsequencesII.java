package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;
import java.util.Comparator;

public class LongestUncommonSubsequencesII {


    public int findLUSlength(String[] strs) {
        int res = -1, n = strs.length;
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        for (int i = 0, j; i < n; i++) {
            boolean f = false;
            for (j = 0; j < n; j++) {
                if (i == j) continue;
                if (checkSubsequence(strs[i], strs[j])) {
                    f = true;
                    break;
                }
            }
            if (!f) return strs[i].length();
        }
        return -1;
    }

    public boolean checkSubsequence(String a, String b) {
        int i = 0;
        for (int j = 0; j < b.length() && i < a.length(); j++) {
            if (a.charAt(i) == b.charAt(j))
                i++;
        }
        return i == a.length();
    }
}
