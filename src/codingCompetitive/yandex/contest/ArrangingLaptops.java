package codingCompetitive.yandex.contest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArrangingLaptops {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = reader.readLine().split(" ");
        int x1 = Integer.parseInt(str[0]);
        int x2 = Integer.parseInt(str[1]);
        int y1 = Integer.parseInt(str[2]);
        int y2 = Integer.parseInt(str[3]);
        int s1x = Math.max(x1, x2) + Math.max(y1, y2);
        int s1y = Math.max(Math.min(x1, x2), Math.min(y1, y2));
        int s2x = Math.max(x1, x2) + Math.min(y1, y2);
        int s2y = Math.max(Math.min(x1, x2), Math.max(y1, y2));
        int s3x = Math.min(x1, x2) + Math.min(y1, y2);
        int s3y = Math.max(Math.max(x1, x2), Math.max(y1, y2));
        int s4x = Math.min(x1, x2) + Math.max(y1, y2);
        int s4y = Math.max(Math.max(x1, x2), Math.min(y1, y2));
        List<int[]> res = new ArrayList<>();
        res.add(new int[]{s1x, s1y, s1x * s1y, 1});
        res.add(new int[]{s2x, s2y, s2x * s2y, 2});
        res.add(new int[]{s3x, s3y, s3x * s3y, 3});
        res.add(new int[]{s4x, s4y, s4x * s4y, 4});
        int[] min = res.get(0);
        for (int[]x: res) {
            if (x[2] < min[2])
                min = x;
        }
        System.out.println(min[0] + " " + min[1]);
        reader.close();
        writer.close();
    }
}
