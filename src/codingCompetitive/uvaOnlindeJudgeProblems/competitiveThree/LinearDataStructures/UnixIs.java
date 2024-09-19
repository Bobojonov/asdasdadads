package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.LinearDataStructures;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UnixIs {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if (s == null || s.equals("")) break;
            int n = Integer.parseInt(s);
            int t = n;
            List<String> list = new ArrayList<>();
            int max = 0;
            while (n --> 0) {
                s = sc.nextLine();
                max = Math.max(max, s.length());
                list.add(s);
            }
            Collections.sort(list);
            System.out.println("------------------------------------------------------------");
            int col = 62 / (max + 2);
            int rows = (int)Math.ceil(t * 1.0 / col);
            for (int i = 0; i < rows; i++) {
                for (int j = i; j < t; j += rows) {
                    System.out.print(list.get(j));
                    if (j + rows < t) {
                        for(int k = list.get(j).length(); k < max + 2; ++k)
                            System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
