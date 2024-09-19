package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

public class SynchingSignals {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int cases = 1;
        PrintWriter pr = new PrintWriter(System.out);
        while (true) {
            String s = sc.nextLine();
            if (s == null || s.equals(""))
                break;
            int minTime = 90, max = 3600, curr;
            pr.append("Set " + cases++ + " ");
            String[] str = s.split(" ");
            Vector<Integer> times = new Vector<>();
            for (int i = 0; i < str.length; i++) {
                int t = Integer.parseInt(str[i]);
                times.add(t);
                if (minTime > t)
                    minTime = t;
                curr = minTime * 2;
                while (!allGreen(times, curr) && curr <= max) {
                    curr++;
                    if (curr == max + 1)
                        pr.append("is unable to sync after one hour.\n");
                    else
                        pr.append("synchs again at " + curr % 60 + " minute(s) and " + max / 60 + " second(s) after all turning green.\n");
                }
            }

        }

    }

    public static boolean allGreen(Vector<Integer> times, int time) {
        for (int i = 0; i < times.size(); i++) {
            if ((time % (times.get(i) * 2)) >= times.get(i) - 5)
                return false;
        }
        return true;
    }
}
