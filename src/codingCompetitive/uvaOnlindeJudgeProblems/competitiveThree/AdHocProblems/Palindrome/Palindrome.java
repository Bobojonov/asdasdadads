package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.AdHocProblems.Palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Palindrome {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals(""))
                break;
            char[] str = s.toCharArray();
            boolean mirror, reqular;
            mirror = reqular = true;
            for (int i = 0; i < s.length() / 2; i++) {
                if (reqular) {
                    if (str[i] != str[str.length - i - 1])
                        reqular = false;
                }
                if (mirror) {
                    if (str[i] == 'E')
                        str[i] = '3';
                    else if (str[i] == 'J')
                        str[i] = 'L';
                    else if (str[i] == 'S')
                        str[i] = '2';
                    else if (str[i] == 'Z')
                        str[i] = '5';
                    else if (str[i] == '3')
                        str[i] = 'E';
                    else if (str[i] == 'L')
                        str[i] = 'J';
                    else if (str[i] == '2')
                        str[i] = 'S';
                    else if (str[i] == '5')
                        str[i] = 'Z';
                    if (str[i] == 'B' || str[i] == 'C' || str[i] == 'D' || str[i] == 'F' || str[i] == 'G' ||
                            str[i] == 'K' || str[i] == 'N' || str[i] == 'P' || str[i] == 'Q' || str[i] == 'R' ||
                            str[i] == '4' || str[i] == '6' || str[i] == '7' || str[i] == '9')
                        mirror = false;
                    else if (str[i] != str[str.length - i - 1])
                        mirror = false;
                }
            }
            if (mirror && str.length % 2 == 1) {
                int mid = str.length / 2;
                if (!(str[mid] == 'A' || str[mid] == 'H' || str[mid] == 'I' || str[mid] == 'M' || str[mid] == 'O' ||
                        str[mid] == 'T' || str[mid] == 'U' || str[mid] == 'V' || str[mid] == 'W' || str[mid] == 'X' ||
                        str[mid] == 'Y' || str[mid] == '1' || str[mid] == '8'))
                    mirror = false;
            }
            System.out.print(s + " -- is ");
            if (mirror && reqular)
                System.out.println("a mirrored palindrome.");
            else if (mirror)
                System.out.println("a mirrored string.");
            else if (reqular)
                System.out.println("a regular palindrome.");
            else System.out.println("not a palindrome.");
            System.out.println();
        }
    }
}
