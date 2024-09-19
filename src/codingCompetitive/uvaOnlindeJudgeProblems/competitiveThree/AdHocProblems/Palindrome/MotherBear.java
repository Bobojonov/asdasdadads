package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.AdHocProblems.Palindrome;

import java.util.Scanner;

public class MotherBear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if (s.equals("DONE")) break;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isAlphabetic(ch))
                    sb.append(Character.toLowerCase(ch));
            }
            String rev = new StringBuilder(sb).reverse().toString();
            if (sb.toString().equals(rev)) System.out.println("You won't be eaten!");
            else System.out.println("Uh oh..");
        }
    }
}
