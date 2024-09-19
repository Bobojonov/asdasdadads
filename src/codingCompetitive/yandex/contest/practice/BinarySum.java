package codingCompetitive.yandex.contest.practice;

import java.util.Scanner;

public class BinarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int r = 0;
        StringBuilder res = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = r;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            res.append(sum % 2);
            r = sum / 2;
        }
        if (r != 0)
            res.append(r);
        System.out.println(res.reverse());
    }
}
