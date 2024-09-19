package codingCompetitive.yandex;

import java.io.*;
import java.util.Arrays;

public class ProgrammerOnTheBeach {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            int[] arr = new int[n];
            String[] str = reader.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            Arrays.sort(arr);
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length - 1; i++) {
                int xor = arr[i] ^ arr[i + 1];
                if (xor < min) min = xor;
            }
            System.out.println(min);
        }
        reader.close();
        writer.close();
    }
}
