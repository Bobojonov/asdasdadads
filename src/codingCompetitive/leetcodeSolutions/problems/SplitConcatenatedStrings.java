package codingCompetitive.leetcodeSolutions.problems;

public class SplitConcatenatedStrings {

    public static String splitLoopedString(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            String reversed = new StringBuilder(strs[i]).reverse().toString();
            strs[i] = strs[i].compareTo(reversed) < 0 ? reversed : strs[i];
        }
        String res = "";
        for (int i = 0; i < strs.length; i++) {
            String reversed = new StringBuilder(strs[i]).reverse().toString();
            for (String s: new String[]{strs[i], reversed}) {
                for (int j = 0; j < s.length(); j++) {
                    StringBuilder sb = new StringBuilder(s.substring(j));
                    for (int k = i + 1; k < strs.length; k++)
                        sb.append(strs[k]);
                    for (int k = 0; k < i; k++)
                        sb.append(strs[k]);
                    sb.append(s, 0, j);
                    if (sb.toString().compareTo(res) > 0)
                        res = sb.toString();
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"abc", "xyz"};
        System.out.println(splitLoopedString(strs));
    }
}
