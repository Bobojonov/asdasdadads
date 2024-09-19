package codingCompetitive.leetcodeSolutions.problems;

import java.util.*;

public class LongestWordDictionaryDeleting {

    public String findLongestWord(String s, List<String> dictionary) {
        List<String> ls = new ArrayList<>();
        int cnt = 1;
        for (int i = 0; i < dictionary.size(); i++) {
            String b = dictionary.get(i);
            if (hasWord(s, b)) {
                if (ls.isEmpty()) ls.add(b);
                else if (ls.get(ls.size() - 1).length() < b.length()) {
                    ls.clear();
                    ls.add(b);
                } else if (ls.get(ls.size() - 1).length() == b.length())
                    ls.add(b);
            }
        }
        Collections.sort(ls, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                for (int i = 0, j = 0; i < o1.length() && j < o2.length(); i++, j++) {
                    if (o1.charAt(i) < o2.charAt(j)) return -1;
                    if (o1.charAt(i) > o2.charAt(j)) return 1;
                }
                return 0;
            }
        });
        return ls.isEmpty() ? "" : ls.get(0);
    }

    public boolean hasWord(String s, String dict) {
        int i = 0;
        for (int j = 0; j < s.length() && i < dict.length(); j++) {
            if (s.charAt(j) == dict.charAt(i))
                i++;
        }
        return i == dict.length();
    }

}
