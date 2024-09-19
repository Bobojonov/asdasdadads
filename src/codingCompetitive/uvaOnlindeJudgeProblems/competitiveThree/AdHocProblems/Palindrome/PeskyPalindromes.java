package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.AdHocProblems.Palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PeskyPalindromes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals(""))
                break;
            Map<String, Integer> map = new HashMap<>();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i; j < s.length(); j++) {
                    String substr = s.substring(i, j + 1);
                    String reverse = new StringBuilder(substr).reverse().toString();
                    if (!map.containsKey(substr) && reverse.equals(substr)){
                        count++;
                        map.put(substr, 1);
                    }
                }
            }
            System.out.println("The string '" + s + "' contains " + count + " palindromes.");
        }
    }


}
