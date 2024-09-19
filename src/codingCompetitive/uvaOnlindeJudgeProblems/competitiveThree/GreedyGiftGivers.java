package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class GreedyGiftGivers {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringBuilder result = new StringBuilder();
        while ((line = br.readLine()) != null) {

            int n = Integer.parseInt(line);
            Map<String, Integer> map = new HashMap<>();
            String[] names = br.readLine().split(" ");

            for (int i = 0; i < n; i++)
                map.put(names[i], 0);
            for (int i = 0; i < n; i++) {
                String[] tmp = br.readLine().split(" ");
                String name = tmp[0];
                int spentMoney = Integer.parseInt(tmp[1]);
                int nPeople = Integer.parseInt(tmp[2]);
                int v = map.get(name);
                if (nPeople > 0)
                    v = map.get(name) - (spentMoney - (spentMoney % nPeople));
                for (int j = 3; j < nPeople + 3; j++) {
                    map.put(tmp[j], map.get(tmp[j]) + spentMoney / nPeople);
                }
                map.put(name, v);
            }
            for (int i = 0; i < names.length; i++)
                result.append(String.format("%s %d", names[i], map.get(names[i]))).append("\n");
            result.append("\n");
        }

        result.deleteCharAt(result.length() - 1);
        System.out.print(result);
    }
}
