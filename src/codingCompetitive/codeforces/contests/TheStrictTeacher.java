package codingCompetitive.codeforces.contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheStrictTeacher {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] str = reader.readLine().split(" ");
            int m = Integer.parseInt(str[1]);
            int q = Integer.parseInt(str[2]);
            List<Integer> b = new ArrayList<>();
            str = reader.readLine().split(" ");
            for (int i = 0; i < m; i++) {
                b.add(Integer.parseInt(str[i]));
            }
            Collections.sort(b);
            int[] a = new int[q];
            for (int i = 0; i < q; i++) {
                a[i] = Integer.parseInt(reader.readLine());
            }
            for (int i = 0; i < q; i++) {
                int k = Collections.binarySearch(b, a[i]);
                if (k < 0) {
                    k = -(k + 1);
                }
                if (k == 0) {
                    System.out.print(b.get(0) - a[i] + " ");
                } else if (k == m) {
                    System.out.print(a[i] - b.get(m - 1) + " ");
                } else {
                    System.out.print(Math.min(b.get(k) - a[i], a[i] - b.get(k - 1)) + " ");
                }
            }
            System.out.println();
        }
    }
}
