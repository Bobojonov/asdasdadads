package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class longestPalindromicSubstring {

    public static String longestPalindromicSubstring(String str) {
        char[] arr = str.toCharArray();
        String longest = "";
        if (arr.length == 1) return str;
        for (int i = 0; i < arr.length; i++) {
            int r = arr.length - 1;
            while (r > i) {
                if (arr[i] == arr[r]) {
                    String substring = str.substring(i, r + 1);
                    if (checkPalindromes(substring) && substring.length() > longest.length()) longest = substring;
                }
                r--;
            }

        }
        return longest;
    }

    public static boolean checkPalindromes(String str) {
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "abaxyzzyxf";
        System.out.println(longestPalindromicSubstring(string));
    }
}

