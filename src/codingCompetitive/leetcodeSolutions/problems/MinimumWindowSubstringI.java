package codingCompetitive.leetcodeSolutions.problems;

public class MinimumWindowSubstringI {
    public static String minWindow(String s, String t) {
        String result = s;
        for (int i = 0; i < s.length(); i++) {
            int cnt = 0;
            if (t.contains(String.valueOf(s.charAt(i)))) {
                StringBuilder curr = new StringBuilder();
                boolean[] used = new boolean[26];
                for (int j = i; j < s.length(); j++) {
                    if (t.contains(String.valueOf(s.charAt(j)))) {
                        if (Character.isUpperCase(s.charAt(j)) && !used[s.charAt(j) - 'A']) {
                            cnt++;
                            used[s.charAt(j) - 'A'] = true;
                        }
                        if (Character.isLowerCase(s.charAt(j)) && !used[s.charAt(j) - 'a']) {
                            cnt++;
                            used[s.charAt(j) - 'a'] = true;
                        }
                    }
                    curr.append(s.charAt(j));
                }
                if (cnt == t.length()) {
                    if (result.length() > curr.length()) result = curr.toString();
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}
