package codingCompetitive.leetcodeSolutions.problems;

public class TakeKEachCharacterFromLToR {

    public int takeCharacters(String s, int k) {
        int res = Integer.MAX_VALUE, c[] = {0, 0, 0};
        for (int i = 0; i < s.length(); i++) c[s.charAt(i) - 'a']++;
        if (c[0] < k || c[1] < k || c[2] < k) return -1;
        for (int i = 0, j = 0; j < s.length(); j++) {
            c[s.charAt(j) - 'a']--;
            while (i <= j && (c[0] < k || c[1] < k || c[2] < k)) c[s.charAt(i++) - 'a']++;
            res = Math.min(res, s.length() - (j - i + 1));
        }
        return res;
    }
}
