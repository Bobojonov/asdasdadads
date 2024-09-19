package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class TourDeFrance {

    public static void main(String[] args) throws Throwable {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String st = br.readLine();
            if (st == null || st.equals("0"))
                break;
            String[] str = st.split(" ");
            int f = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);
            str = br.readLine().split(" ");
            int[] front = new int[f];
            for (int i = 0; i < f; i++)
                front[i] = Integer.parseInt(str[i]);
            str = br.readLine().split(" ");
            int[] rear = new int[r];
            for (int i = 0; i < r; i++)
                rear[i] = Integer.parseInt(str[i]);
            int cnt = 0;
            double[] drive = new double[100];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < f; j++) {
                    drive[cnt++] = rear[i] * 1.0 / front[j];
                }
            }
            Arrays.sort(drive, 0, cnt);
            double max = -1;
            for (int i = 0; i < cnt - 1; i++)
                max = Math.max(max, drive[i + 1] / drive[i]);
            System.out.printf("%.2f\n", max);
        }
    }
}
