package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GroupReverse {

    public static void main(String[] args) throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals("0")) break;
            StringTokenizer st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            n = str.length() / n;
            StringBuilder sb = new StringBuilder();
            int i;
            for (i = 0; i < str.length(); i++) {
                if (sb.length() >= 1 && sb.length() % n == 0) {
                    while (sb.length() > 0) {
                        System.out.print(sb.charAt(sb.length() -1));
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    sb.append(str.charAt(i));
                } else sb.append(str.charAt(i));
            }
            while (sb.length() > 0) {
                System.out.print(sb.charAt(sb.length() -1));
                sb.deleteCharAt(sb.length() - 1);
            }
            System.out.println();
        }
    }
}
