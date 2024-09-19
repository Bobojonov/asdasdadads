package codingCompetitive.yandex;

import java.io.*;
import java.util.HashMap;

public class MiddleElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(str[i]);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int i : map.values())
            if (i == 1)
                cnt++;
        System.out.println(cnt);

        reader.close();
        writer.close();
    }
}
