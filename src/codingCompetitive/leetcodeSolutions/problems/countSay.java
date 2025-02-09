package codingCompetitive.leetcodeSolutions.problems;

public class countSay {

    public String countAndSay(int n) {
        StringBuilder str = new StringBuilder("1");
        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            int count = 1;
            str = new StringBuilder();
            for (int j = 1; j < sb.length(); j++) {
                if (sb.charAt(j) == sb.charAt(j - 1)) count++;
                else {
                    str.append(String.valueOf(count));
                    str.append(sb.charAt(j - 1));
                    count = 1;
                }
            }
            str.append(String.valueOf(count));
            str.append(sb.charAt(sb.length() - 1));
            sb = str;
        }
        return new String(str);
    }
}
