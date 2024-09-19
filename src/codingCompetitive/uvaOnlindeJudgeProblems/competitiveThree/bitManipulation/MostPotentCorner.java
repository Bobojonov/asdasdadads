package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.bitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class MostPotentCorner {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals("")) break;
            Vector<Integer> weight = new Vector<>();
            int n = Integer.parseInt(s);
            int size = 1 << n;
            for (int i = 0; i < size; i++)
                weight.add(Integer.parseInt(br.readLine()));
            Vector<Integer> potentiates = new Vector<>();
            for (int i = 0; i < size; i++) {
                int potency = 0;
                for (int j = 0; j < n; j++)
                    potency += weight.get(i ^ (1 << j));
                potentiates.add(potency);
            }
            int max = 0;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < n; j++)
                    max = Math.max(max, potentiates.get(i) + potentiates.get(i ^ (1 << j)));
            }
            System.out.println(max);
        }
    }
}
