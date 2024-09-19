package codingCompetitive.leetcodeSolutions.crackingCodingInterview;

public class URLify {

    public static String replaceString(String str, int len) {
        String replace = "%20";
        String result = "";
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') result += replace;
            else result += str.charAt(i);
        }
        return result;
    }

    public static char[] replaceStr(char[] str, int len) {
        int countSpace = 0;
        for (int i = 0; i < len; i++) if (str[i] == ' ') countSpace++;
        int idx = len + countSpace * 2;
        if (len < str.length) str[len] = '\0';
        for (int i = len - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[idx - 1] = '0';
                str[idx - 2] = '2';
                str[idx - 3] = '%';
                idx -= 3;
            } else {
                str[idx - 1] = str[i];
                idx--;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        int len = 13;
        System.out.println(replaceString(str, len));
        System.out.println(replaceStr(str.toCharArray(), len));

    }
}
