package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class OnlyIDid {

    public static void main(String[] args) throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        int cases = Integer.parseInt(br.readLine());
        for (int t = 0; t < cases; t++) {
            Set<Integer> fr1 = new HashSet<>();
            Set<Integer> fr2 = new HashSet<>();
            Set<Integer> fr3 = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            for (int i = 0; i < n; i++)
                fr1.add(Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            for (int i = 0; i < n; i++)
                fr2.add(Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            for (int i = 0; i < n; i++)
                fr3.add(Integer.parseInt(st.nextToken()));
            PriorityQueue<Integer>[] arr = new PriorityQueue[3];
            arr[0] = new PriorityQueue<Integer>();
            arr[1] = new PriorityQueue<Integer>();
            arr[2] = new PriorityQueue<Integer>();
            int max = 0;
            for (Integer i: fr1) {
                if (!fr2.contains(i) && !fr3.contains(i)) {
                    arr[0].add(i);
                }
            }
            max = arr[0].size();
            for (Integer i: fr2) {
                if (!fr1.contains(i) && !fr3.contains(i))
                    arr[1].add(i);
            }
            max = Math.max(max, arr[1].size());
            for (Integer i: fr3) {
                if (!fr2.contains(i) && !fr1.contains(i))
                    arr[2].add(i);
            }
            max = Math.max(max, arr[2].size());
            pr.append("Case #" + (t + 1) + ":\n");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].size() == max) {
                    pr.append(i + 1 + " " + arr[i].size());
                    while (!arr[i].isEmpty()) {
                        pr.append(" " + arr[i].poll());
                    }
                    pr.append("\n");
                }
            }
        }
        pr.flush();
    }
}
