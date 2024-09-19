package neetcode.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsAllBinaryCodes {
    public static boolean hasAllCodes(String s, int k) {
        if (k > s.length()) return false;
        Set<String> set = new HashSet<>();
        for (int i = 0; i + k - 1 < s.length(); i++) {
            set.add(s.substring(i, i + k));
        }
        return set.size() == Math.pow(2, k);
    }

    public static void main(String[] args) {
        System.out.println(hasAllCodes("00110110", 2));
    }
}
