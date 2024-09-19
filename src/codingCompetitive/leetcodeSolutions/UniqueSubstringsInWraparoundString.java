package codingCompetitive.leetcodeSolutions;

public class UniqueSubstringsInWraparoundString {
    public static int findSubstringInWraproundString(String s) {
        int[] count = new int[26];
        int max_length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 || s.charAt(i - 1) - s.charAt(i) == 25))
                max_length++;
            else max_length = 1;
            int index = s.charAt(i) - 'a';
            count[index] = Math.max(count[index], max_length);
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            cnt += count[i];
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(findSubstringInWraproundString("cac"));
    }
}
