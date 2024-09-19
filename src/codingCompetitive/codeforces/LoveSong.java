package codingCompetitive.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LoveSong {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
        char[] s = br.readLine().toCharArray();
        int[][] cnt = new int[n][26];
        cnt[0][s[0] - 'a'] = 1;
        for (int i = 1; i < n; i++) {
            cnt[i][s[i] - 'a'] = 1;
            for (int j = 0; j < 26; j++)
                cnt[i][j] += cnt[i - 1][j];
        }

        while (q --> 0) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken()) - 1, r = Integer.parseInt(st.nextToken()) - 1;
            int res = 0;
            for (int i = 0; i < 26; i++) {
                int k = cnt[r][i];
                if (l != 0)
                    k -= cnt[l - 1][i];
                res += k * (i + 1);
            }
            System.out.println(res);
        }

    }

}
