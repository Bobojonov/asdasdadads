package codingCompetitive.advanceOfCode;

import java.io.IOException;
import java.util.Scanner;

public class DayFourTaskOne {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s;
        int cnt = 0;
        while (true) {
            s = sc.nextLine();
            if (s == null || s.equals("")) break;
            String[] parts = s.split(",");
            int idx = parts[0].indexOf('-');
            int left1 = Integer.parseInt(parts[0].substring(0, idx));
            int right1 = Integer.parseInt(parts[0].substring(idx + 1));
            idx = parts[1].indexOf('-');
            int left2 = Integer.parseInt(parts[1].substring(0, idx));
            int right2 = Integer.parseInt(parts[1].substring(idx + 1));
            if ((left1 <= left2 && left2 <= right1) || (left2 <= left1 && left1 <= right2))
                cnt++;
        }
        System.out.println(cnt);
    }
}
