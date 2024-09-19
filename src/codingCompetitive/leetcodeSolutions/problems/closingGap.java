package codingCompetitive.leetcodeSolutions.problems;

import java.util.Scanner;

public class closingGap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), sum = 0;
            for (int i = 0; i < n; i++){
                sum += sc.nextInt();
            }
            if (sum % n == 0) System.out.println(0);
            else System.out.println(1);
        }
    }
}
