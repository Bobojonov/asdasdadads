package codingCompetitive.csesProblemSet.introductoryProblems;

import java.util.Scanner;

public class repetitions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int maxLen = 1, currLen = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i -1)) {
                maxLen = Math.max(maxLen, currLen);
                currLen = 1;
            }
            else currLen++;
        }
        System.out.println(Math.max(maxLen, currLen));
    }
}
