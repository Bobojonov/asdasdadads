package codingCompetitive.yandex.contest;

import java.io.*;

public class Ambulance {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = reader.readLine().split(" ");
        int k1 = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int k2 = Integer.parseInt(str[2]);
        int p2 = Integer.parseInt(str[3]);
        int n2 = Integer.parseInt(str[4]);
        int possibleX = -1;
        boolean f = true;
        for (int i = 1; i <= k2 ; i++) {
            if ((k2 - 1) % i != 0) continue;
            int calculatedP2 = (k2 - 1) / (i * m) + 1;
            int calculatedN2 = ((k2 - 1) % (i * m)) / i + 1;
            if (calculatedP2 == p2 && calculatedN2 == n2) {
                if (possibleX == -1)
                    possibleX = i;
                else {
                    int tempP1 = (k1 - 1) / (i * m) + 1;
                    int tempN1 = ((k1 - 1) % (i * m)) / i + 1;
                    int previousP1 = (k1 - 1) / (possibleX * m) + 1;
                    int previousN1 = ((k1 - 1) % (possibleX * m)) / possibleX + 1;
                    if (tempP1 != previousP1 || tempN1 != previousN1) {
                        f = false;
                        break;
                    }
                }
            }
        }
        if (possibleX == -1) System.out.println("-1 -1");
        else if (!f) System.out.println("0 1");
        else {
            int P1 = (k1 - 1) / (possibleX * m) + 1;
            int N1 = ((k1 - 1) % (possibleX * m)) / possibleX + 1;
            System.out.println(P1 + " " + N1);
        }
        reader.close();
        writer.close();
    }
}
