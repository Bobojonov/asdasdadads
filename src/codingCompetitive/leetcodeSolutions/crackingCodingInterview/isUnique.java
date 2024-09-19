package codingCompetitive.leetcodeSolutions.crackingCodingInterview;

public class isUnique {
    public static Boolean isUniq(String s) {
        if (s.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

    public static Boolean isUniqueChars(String str) {
        System.out.println(3 & 4);
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abce";
        System.out.println(isUniqueChars(s));
    }
}
