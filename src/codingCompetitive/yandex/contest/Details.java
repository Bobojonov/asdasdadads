package codingCompetitive.yandex.contest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Details {
    static int res = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        int m = Integer.parseInt(str[2]);
        getCnt(n, k, m);
        System.out.println(res);
        reader.close();
        writer.close();
    }

    private static void getCnt(int n, int k, int m) {
        if (n > 0 && k > 0 && m > 0) {
            if (n < k || k < m) return;
            int noUse = 0;
            int cntK = n / k;
            noUse += n % k;
            int cntMFromOneK = k / m;
            int noUseMFromOneK = k % m;
            res += cntMFromOneK * cntK;
            noUse += noUseMFromOneK * cntK;
            getCnt(noUse, k, m);
        }
    }
}
