package codingCompetitive.leetcodeSolutions.problems;

public class longestAlphabeticalContinuousSubstring {
    public static int longestContinuousSubstring(String s) {
        int maxlen = 0, curr = 1;
        for (int i = 1; i < s.length(); i++ ) {
            if ((s.charAt(i) - 'a') - (s.charAt(i - 1) - 'a') == 1) curr++;
            else {
                maxlen = Math.max(maxlen, curr);
                curr = 1;
            }
        }
        return Math.max(maxlen, curr);
    }

    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(longestContinuousSubstring(s));
    }
}
