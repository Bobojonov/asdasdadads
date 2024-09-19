package codingCompetitive.AdvanceOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class dayOne {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals("")) break;
            int sum = Integer.parseInt(s);
            while (!(s = br.readLine()).equals(""))
                sum += Integer.parseInt(s);
            pq.offer(sum);
        }
        int result = pq.poll() + pq.poll() + pq.poll();
        System.out.println(result);
    }
}
