package neetcode.array;

public class MinimumChangesToMakeAlternatingBinaryString {
    public int minOperations(String s) {
        int res = 0, n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) - '0' != i % 2) res++;
        }
        return Math.min(res, n - res);
    }
}
