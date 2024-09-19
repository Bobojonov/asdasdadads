package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class JollyJumpers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals(""))
                break;
            String[] str = s.split(" ");
            int n = Integer.parseInt(str[0]);
            Set<Integer> set = new HashSet<>();
            for (int i = 1; i <= n - 1; i++)
                set.add(i);
            for (int i = 0; i < n - 1; i++) {
                int a = Integer.parseInt(str[i + 1]);
                int b = Integer.parseInt(str[i + 2]);
                int diff = Math.abs(a - b);
                set.remove(diff);
            }
            if (set.isEmpty()) System.out.println("Jolly");
            else System.out.println("Not jolly");
        }
    }
}
