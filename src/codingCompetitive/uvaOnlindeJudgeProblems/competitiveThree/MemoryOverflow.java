package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class MemoryOverflow {

    public static void main(String[] args) throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()), cases = 1;
        while (t --> 0) {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            String s = str[2];
            List<Character> list =  new ArrayList<>();
            int res = 0;
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (list.contains(ch)) res++;
                if (i >= k) list.remove(list.indexOf(s.charAt(i - k)));
                list.add(ch);
            }
            System.out.println("Case " + cases++ + ": " + res);
        }
    }
}
