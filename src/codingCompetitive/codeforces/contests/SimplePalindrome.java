package codingCompetitive.codeforces.contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SimplePalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        String vowels = "aeiou";
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            int[] res = new int[5];
            Arrays.fill(res, n / 5);
            for (int i = 0; i < n % 5; i++) {
                res[i]++;
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < res[i]; j++) {
                    System.out.print(vowels.charAt(i));
                }
            }
            System.out.println();
        }
        reader.close();
    }
}
