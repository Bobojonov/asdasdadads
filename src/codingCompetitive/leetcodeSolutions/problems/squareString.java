package codingCompetitive.leetcodeSolutions.problems;

import java.util.Scanner;

public class squareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            isSquare(s);
        }
    }

    public static void isSquare(String s) {
        if (s.length() % 2 == 1) {
            System.out.println("NO");
            return;
        }
        String s1 = "", s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() / 2) s1 += s.charAt(i);
            else s2 += s.charAt(i);
        }
        if (s1.equals(s2)) System.out.println("YES");
        else System.out.println("NO");
    }
}
