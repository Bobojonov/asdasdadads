package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses {
    public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 3; i++)
            for (int j = 1; j <= 3; j++)
                for (int k = 1; k <= 3; k++)
                    for (int l = 1; l <= 3; l++)
                        if (i + j + k + l == s.length()) {
                            int a = Integer.parseInt(s.substring(0, i));
                            System.out.println(a);
                            int b = Integer.parseInt(s.substring(i, i + j));
                            System.out.println(b);
                            int c = Integer.parseInt(s.substring(i + j, i + j + k));
                            System.out.println(c);
                            int d = Integer.parseInt(s.substring(i + j + k, i + j + k + l));
                            System.out.println(d);
                            if (a <= 255 && b <= 255 && c <= 255 && d <= 255) {
                                sb.append(a).append(".").append(b).append(".").append(c).append(".").append(d);
                            }
                            if (sb.length() - 3 == s.length()) res.add(sb.toString());
                            sb.delete(0, sb.length());
                        }
        return res;
    }

    public static void main(String[] args) {
        String s = "25525511135";
        System.out.println(restoreIpAddresses(s));
    }
}
