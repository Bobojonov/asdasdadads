package codingCompetitive.codeforces.contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareOrNot {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String str = reader.readLine();
            if (check(str, n)) System.out.println("Yes");
            else System.out.println("No");
        }
        reader.close();
    }

    public static boolean check(String str, int n) {
        int r = (int) Math.sqrt(n);
        if (r * r != n) {
            return false;
        }
        int[][] matrix = new int[r][r];
        int cnt = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                matrix[i][j] = str.charAt(cnt) - '0';
                cnt++;
            }
        }
        if (matrix[0][0] == 0 || matrix[0][r - 1] == 0 || matrix[r - 1][0] == 0 || matrix[r - 1][r - 1] == 0) {
            return false;
        }
        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < r - 1; j++) {
                if (matrix[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
