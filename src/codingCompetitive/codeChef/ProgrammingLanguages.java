package codingCompetitive.codeChef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProgrammingLanguages {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int a1 = Integer.parseInt(str[2]);
            int b1 = Integer.parseInt(str[3]);
            int a2 = Integer.parseInt(str[4]);
            int b2 = Integer.parseInt(str[5]);
            if (a > b) {
                int tmp = b;
                b = a;
                a = tmp;
            }
            if (a1 > b1) {
                int tmp = b1;
                b1 = a1;
                a1 = tmp;
            }
            if (a2 > b2) {
                int tmp = b2;
                b2 = a2;
                a2 = tmp;
            }
            if (a == a1 && b == b1) {
                System.out.println(1);
            } else if (a == a2 && b == b2) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
        br.close();
        writer.close();
    }
}
