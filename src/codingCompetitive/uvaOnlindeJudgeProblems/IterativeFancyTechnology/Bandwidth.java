package codingCompetitive.uvaOnlindeJudgeProblems.IterativeFancyTechnology;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Bandwidth {
    static int[][] map;
    static int[] app, used, way, tmp;
    static int n, ans;
    static int[] set = new int[26];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s;
        while (!(s = sc.nextLine()).equals("#")) {
            int len = s.length();
            used = new int[26];
            app = new int[26];
            map = new int[26][26];
            way = new int[26];
            tmp = new int[26];
            n = 0;
            int st = 0, j = 0, ed;
            for (int i = 0; i < len; i++) {
                st = s.charAt(i) - 'A';
                if (used[st] == 0) {
                    used[st] = 1;
                    app[n++] = st;
                }
                j = i + 2;
                while (s.charAt(j) != ';' && s.charAt(j) != '\0') {
                    ed = s.charAt(j) - 'A';
                    map[st][ed] = 1;
                    if (used[ed] == 0) {
                        used[ed] = 1;
                        app[n++] = ed;
                    }
                    j++;
                }
                i = j;
            }
            Arrays.sort(app);
            ans = 0xffff;
            dfs(0);
            for (int i = 0; i < n; i++)
                System.out.print(way[i] + 'A' + " ");
//            System.out.println("-> %d\n", ans);
        }
    }

    public static int dfs(int idx) {
        if (idx == n) {
            int i, j;
            int bandwith = 0;
            for (i = 0; i < n; i++) {
                for (j = 0; j < 26; j++) {
                    if (map[app[i]][j] == 1) {
                        if (Math.abs(set[app[i]] - set[j]) > bandwith)
                            bandwith = Math.abs(set[app[i]] - set[j]);
                    }
                }
            }
            if (bandwith < ans) {
                ans = bandwith;
                way = Arrays.copyOf(tmp, way.length);
            }
            return 0;
        }
        for (int i = 0; i < n; i++) {
            if (used[i] == 0) {
                used[i] = 1;
                tmp[idx] = app[i];
                set[app[i]] = idx;
                dfs(idx + 1);
                used[i] = 0;
            }
        }
        return 0;
    }
}
