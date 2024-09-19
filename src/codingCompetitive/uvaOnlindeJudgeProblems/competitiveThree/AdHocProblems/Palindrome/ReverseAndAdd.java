package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.AdHocProblems.Palindrome;

import java.util.Scanner;

public class ReverseAndAdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0) {
            String num = sc.nextLine();
            String rev = (new StringBuilder().append(num).reverse()).toString();
            int cnt = 1;
            while (true) {
                StringBuilder sb = new StringBuilder();
                int r = 0;
                for (int i = num.length() - 1; i >= 0; i--) {
                    int n1 = Character.getNumericValue(num.charAt(i));
                    int n2 = Character.getNumericValue(rev.charAt(i));
                    int sum = n1 + n2 + r;
                    r = sum / 10;
                    sum = sum % 10;
                    sb.append(sum);
                }
                if (r > 0)
                    sb.append(r);
                rev = (new StringBuilder().append(sb).reverse()).toString();
                if (rev.equals(sb.toString())){
                    System.out.println(cnt + " " + sb);
                    break;
                }
                cnt++;
                num = sb.toString();
            }
        }
    }
}
