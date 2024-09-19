package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.util.Scanner;

public class RunAroundNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        while ((n = sc.nextInt()) != 0) {
            for (i = n + 1; dfs(i) == 0; i++)
                ;
                System.out.println(i);
        }
    }

    public static int dfs(int n) {
        int[] s = new int[20];
        int[] unique = new int[20];
        int i;
        for (i = 0; n != 0; i++) {
            s[i] = n % 10;
            n /= 10;
            if (unique[s[i]] == 0) unique[s[i]] = 1;
            else return 0;
        }
        int length = i;
        int point = length - 1;
        int[] checker = new int[20];
        int cnt = 0;
        while (cnt < length) {
            int temp = s[point];
            for (int j = 0; j < temp; j++) {
                if (point == 0) point = length - 1;
                else point--;
            }
            if (checker[point] == 1) return 0;
            checker[point] = 1;
            cnt++;
        }
        return 1;
    }

}
