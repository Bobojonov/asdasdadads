package codingCompetitive.leetcodeSolutions.algoAndDs.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] a = new boolean[s.length() + 1];
        a[0] = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i]) {
                for (int j = i + 1; j < a.length; j++) {
                    if (set.contains(s.substring(i, j))) a[j] = true;
                }
            }
            if (a[a.length - 1]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "applepenapple";
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pen");
        System.out.println(wordBreak(s, list));
    }
}
