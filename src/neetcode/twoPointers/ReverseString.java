package neetcode.twoPointers;

public class ReverseString {

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[s.length - i - 1];
            s[s.length - i - 1] = s[i];
            s[i] = tmp;
        }
    }
}
