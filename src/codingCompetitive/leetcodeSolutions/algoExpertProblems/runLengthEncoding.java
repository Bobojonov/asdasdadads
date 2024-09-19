package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.HashSet;
import java.util.Set;

public class runLengthEncoding {
    public static String runLengthEncoding(String string) {
        Set<Character> set = new HashSet<>();
        set.add(string.charAt(0));
        String res = "";
        int count = 1;
        for (int i = 1; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (set.contains(ch)) {
                if (count + 1 > 9) {
                    res += String.valueOf(count) + ch;
                    System.out.println(res);
                    set.clear();
                    set.add(string.charAt(i));
                    count = 1;
                } else count++;
            }
            else {
                res += String.valueOf(count) + string.charAt(i - 1);
                count = 0;
                count++;
                set.clear();
                set.add(string.charAt(i));
            }
        }
        if (!set.isEmpty()) res += String.valueOf(count) + string.charAt(string.length() - 1);
        return res;
    }
    public static void main(String[] args) {
        String s = "AAAAAAAAAAAAAAAAAVBBBCC";
        System.out.println(runLengthEncoding(s));
    }
}
