package codingCompetitive.uvaOnlindeJudgeProblems.treeMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DepartmentOfRedundancy {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        LinkedList<String> list = new LinkedList<>();
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals("")) break;
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()) {
                s = st.nextToken();
                if (!map.containsKey(s)) list.add(s);
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String num: list) {
            sb.append(num);
            sb.append(" ");
            sb.append(map.get(num));
            sb.append('\n');
        }
        System.out.println(sb);

    }
}
