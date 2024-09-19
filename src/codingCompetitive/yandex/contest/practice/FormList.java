package codingCompetitive.yandex.contest.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String a = reader.readLine().replace(" ", "");
        String b = reader.readLine().replace(" ", "");
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            res.append(sum % 10);
            carry = sum / 10;
        }
        if (carry != 0)
            res.append(carry);
        for (int k = res.length() - 1; k >= 0; k--) {
            System.out.print(res.charAt(k) + " ");
        }
        
    }
}
