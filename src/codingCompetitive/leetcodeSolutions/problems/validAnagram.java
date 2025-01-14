package codingCompetitive.leetcodeSolutions.problems;

public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++)
            letters[s.charAt(i) - 'a']++;
        for (int j = 0; j < t.length(); j++){
            letters[t.charAt(j) - 'a'] -= 1;
            if (letters[t.charAt(j) - 'a'] < 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
