package neetcode.twoPointers;

public class MinimumLengthStringAfterDeleting {
    public int minimumLength(String s) {
        int l = 0, r = s.length() - 1, res = 0;
        while (l < r) {
            while (s.charAt(l) == s.charAt(r)) {
                l++;
            }
            while (s.charAt(r) == s.charAt(l - 1))
                r--;
            if (s.charAt(l) != s.charAt(r)) break;
        }
        return r - l + 1;
    }
}
