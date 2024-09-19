package codingCompetitive.yandex.contest.practice;

import java.util.Scanner;

public class BracketGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder res = new StringBuilder();
        generatorBracket(n, 0, 0, "", res);
        System.out.println(res);
    }

    public static void generatorBracket(int n, int l, int r, String bracket, StringBuilder res) {
        if (l == r && r == n)
            res.append(bracket).append("\n");
        else {
            if (l < n) generatorBracket(n, l + 1, r, bracket + "(", res);
            if (r < l) generatorBracket(n, l , r + 1, bracket + ")", res);
        }
    }
}
