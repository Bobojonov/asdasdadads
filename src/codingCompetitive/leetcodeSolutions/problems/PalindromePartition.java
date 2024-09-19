package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        dfs(0, res, new ArrayList<>(), s);
        return res;
    }

    public void dfs(int i, List<List<String>> res, List<String> ls, String s) {
        if (i >= s.length()) res.add(new ArrayList<>(ls));
        for (int j = i; j < s.length(); j++) {
            if (isPalindrome(i, j, s)) {
                ls.add(s.substring(i, j + 1));
                dfs(j + 1, res, ls, s);
                ls.remove(ls.size() - 1);
            }
        }
    }
    public boolean isPalindrome(int l, int r, String s) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}
