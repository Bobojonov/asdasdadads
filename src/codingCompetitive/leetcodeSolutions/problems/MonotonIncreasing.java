package codingCompetitive.leetcodeSolutions.problems;

public class MonotonIncreasing {

    public int minFlipsMonoIncr(String s) {
        int cnt = 0;
        for (char c: s.toCharArray())
            if (c == '0') cnt++;
        int res = cnt;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                res = Math.min(res, --cnt);
            else cnt++;
        }
        return res;
    }

}
