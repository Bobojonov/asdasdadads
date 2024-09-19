package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Antiarithmetic {

    public static void main(String[] args) throws Throwable {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals("0")) break;
            String[] str = s.split(" ");
            String sub = str[0].substring(0, str[0].indexOf(':'));
            int n = Integer.parseInt(sub);
            int[] a = new int[10005];
            int[] nums = new int[10005];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i + 1]);
                nums[a[i]] = i;
            }
            boolean isArith = true;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int x = 2 * a[j] - a[i];
                    if (x >= 0 && x < n) {
                        if (nums[x] > j) {
                            isArith = false;
                            break;
                        }
                    }
                }
            }
            if (isArith) System.out.println("yes");
            else System.out.println("no");
        }

    }
}
