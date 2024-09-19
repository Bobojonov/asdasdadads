package codingCompetitive.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class GardenerArray {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int k = Integer.parseInt(br.readLine()), i = 0;
            Map<Integer, Integer> mp = new HashMap<>();
            while (k --> 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens()) {
                    int x = Integer.parseInt(st.nextToken());
                    if (mp.containsKey(x)) {
                        if (mp.get(x) != 0)
                            mp.put(x, -1);
                        else mp.put(x, i);
                    } else mp.put(x, i);
                }
            }

        }
    }
}
