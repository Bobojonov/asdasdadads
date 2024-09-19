package codingCompetitive.leetcodeSolutions.crackingCodingInterview;

public class isPermutations {

    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] chars = new int[128];
        for (int i = 0; i < s.length(); i++)
            chars[s.charAt(i)]++;
        for (int i = 0; i < t.length(); i++){
            chars[t.charAt(i)]--;
            if (chars[t.charAt(i)] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "good";
        String t = "dog";
        System.out.println(permutation(s, t));
    }
}
