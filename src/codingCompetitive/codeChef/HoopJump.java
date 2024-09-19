package codingCompetitive.codeChef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HoopJump {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            if (n == 1) System.out.println(1);
            else {
                if (n % 2 == 0) System.out.println((n / 2) + 1);
                else System.out.println((n + 1) / 2);
            }
        }
        br.close();
        writer.close();
    }
}
