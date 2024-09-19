package neetcode.array;

public class LargestSubstringBetweenTwoEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max_len = -1;
        for (int i = 0; i < s.length() - 3; i++) {
            for (int j = i + 3; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    max_len = Math.max(j - i, max_len);
                }
            }
        }
        return max_len;
    }
}
