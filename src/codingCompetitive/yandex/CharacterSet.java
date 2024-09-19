package codingCompetitive.yandex;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CharacterSet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = reader.readLine();
        String c = reader.readLine();
        int min = Integer.MAX_VALUE;
        Map<Character, Integer> map2 = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();
        for (char x: c.toCharArray())
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        int l = 0;
        int cnt = 0;
        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            if (map2.containsKey(ch) && Objects.equals(map1.get(ch), map2.get(ch))) cnt++;
            while (cnt == map2.size()) {
                if (r - l + 1 < min) min = r - l + 1;
                char leftChar = s.charAt(l);
                map1.put(leftChar, map1.get(leftChar) - 1);
                if (map2.containsKey(leftChar) && map1.get(leftChar) < map2.get(leftChar))
                    cnt--;
                l++;
            }
        }
        System.out.println(min == Integer.MAX_VALUE ? 0 : min);
        reader.close();
        writer.close();
    }
}
