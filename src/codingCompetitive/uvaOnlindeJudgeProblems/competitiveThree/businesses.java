package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class businesses {

    public static void main(String[] args) throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        String dial = "22233344455566677778889991";
        for (int t = 0; t < cases; t++) {
            br.readLine();
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String s = br.readLine();
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) >= '0' && s.charAt(j) <= '9')
                        sb.append(s.charAt(j));
                    else if (s.charAt(j) == 'Q' || s.charAt(j) == 'Z') continue;
                    else if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z')
                        sb.append(dial.charAt(s.charAt(j) - 'A'));
                    if (sb.length() == 3) sb.append('-');
                }
                map.put(sb.toString(), map.getOrDefault(sb.toString() , 0) + 1);
            }
            boolean f = false;
            List<String> list = new ArrayList<>();
            for (Map.Entry<String, Integer> entry: map.entrySet()) {
                if (entry.getValue() > 1) {
                    f = true;
                    list.add(entry.getKey());
                }
            }
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++)
                System.out.println(list.get(i) + " " + map.get(list.get(i)));
            if (!f) System.out.println("No duplicates.");
            System.out.println();
        }
    }
}
