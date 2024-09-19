package codingCompetitive.yandex.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TriangleMaxim {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] str = reader.readLine().split(" ");
            if (str.length == 1) map.put(Integer.parseInt(str[0]), "");
            else map.put(Integer.parseInt(str[0]), str[1]);
        }
        
        reader.close();
    }
}
